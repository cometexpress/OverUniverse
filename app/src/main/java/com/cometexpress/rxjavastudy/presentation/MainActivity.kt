package com.cometexpress.rxjavastudy.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cometexpress.rxjavastudy.data.network.NetworkUtil
import com.cometexpress.rxjavastudy.data.network.api.HeroesAPI
import com.cometexpress.rxjavastudy.data.repository_impl.HeroesRepositoryImpl
import com.cometexpress.rxjavastudy.databinding.ActivityMainBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val heroesRepo by lazy {
        HeroesRepositoryImpl(apiService = NetworkUtil.getAPI<HeroesAPI>())
    }

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        heroesRepo.getHeroes("damage")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                Log.d(this.javaClass.simpleName, response.toString())
            }, { error ->
                Log.d(this.javaClass.simpleName, error.toString())
            })
            .also { compositeDisposable.add(it) }
    }
}