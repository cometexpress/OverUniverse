package com.cometexpress.rxjavastudy.presentation.splash

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.cometexpress.rxjavastudy.common.base.BaseActivity
import com.cometexpress.rxjavastudy.common.extension.showToast
import com.cometexpress.rxjavastudy.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    private val vm: SplashVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind()
    }

    private fun bind() {
        vm.roles.subscribe { roles ->
            println(roles.toString())
        }.also { compositeDisposable.add(it) }

        vm.isLoading.subscribe { isLoading ->
            Log.i("info", "로딩상태 = $isLoading")
        }.also { compositeDisposable.add(it) }

        vm.toastMessage.subscribe { message ->
            showToast(message)
        }.also { compositeDisposable.add(it) }
    }
}