package com.cometexpress.overuniverse.presentation.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.cometexpress.overuniverse.common.base.BaseActivity
import com.cometexpress.overuniverse.common.extension.showToast
import com.cometexpress.overuniverse.databinding.ActivitySplashBinding
import com.cometexpress.overuniverse.presentation.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    private val vm: SplashVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind()
    }

    private fun bind() {
        vm.completeRoles
            .subscribeOn(AndroidSchedulers.mainThread())
            .delay(500, TimeUnit.MILLISECONDS)
            .subscribe {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            .also { compositeDisposable.add(it) }

        vm.toastMessage.subscribe { message ->
            showToast(message)
        }.also { compositeDisposable.add(it) }
    }
}