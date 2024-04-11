package com.cometexpress.rxjavastudy.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.common.extension.showToast
import com.cometexpress.rxjavastudy.data.network.NetworkUtil
import com.cometexpress.rxjavastudy.data.network.api.HeroesAPI
import com.cometexpress.rxjavastudy.data.repository_impl.HeroesRepositoryImpl
import com.cometexpress.rxjavastudy.databinding.ActivityMainBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val vm: MainVM by viewModels()

//    private val vm: MainVM by viewModels { // scope is this fragment
//        YourViewModelFactory(YourRepository(YourItemDatabase.invoke(requireContext())))
//    }

    private val heroesRepo by lazy {
        HeroesRepositoryImpl(apiService = NetworkUtil.getAPI<HeroesAPI>())
    }

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: RecyclerView UI 연결 및 MVP 패턴 적용
        val test = "tank"

        heroesRepo.getHeroes(test)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { Log.i(this.javaClass.simpleName, "구독 시작") }
            .subscribe({ response ->
                when(response) {
                    is APIResult.Success -> {
                        binding.tvResult.text = response.data.toString()
                        Log.d(this.javaClass.simpleName, response.toString())
                    }
                    is APIResult.Error -> {
                        showToast(response.error.msg)
                        Log.e(this.javaClass.simpleName, response.toString())
                    }
                }

            }, { error ->
                Log.e(this.javaClass.simpleName, error.toString())
            })
            .also { compositeDisposable.add(it) }
    }
}