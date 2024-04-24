package com.cometexpress.overuniverse.presentation.main.hero_info

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.cometexpress.overuniverse.common.base.BaseActivity
import com.cometexpress.overuniverse.common.extension.showToast
import com.cometexpress.overuniverse.databinding.ActivityHeroInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroInfoActivity : BaseActivity<ActivityHeroInfoBinding>(ActivityHeroInfoBinding::inflate) {

    private val vm: HeroInfoVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind()

        val key = intent.getStringExtra("heroKey")
        key?.let { vm.getHeroInfo(key) }
    }

    private fun bind() {
        vm.heroInfo
            .subscribe { heroInfo ->
                Log.i("영웅정보", "영웅 정보 $heroInfo")
            }
            .also { compositeDisposable.add(it) }

//        vm.isLoading.subscribe { isLoading ->
//            binding.loadingView.isVisible = isLoading
//        }.also { compositeDisposable.add(it) }

        vm.toastMessage.subscribe { message ->
            showToast(message)
        }.also { compositeDisposable.add(it) }
    }
}