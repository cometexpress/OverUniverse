package com.cometexpress.rxjavastudy.presentation.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@HiltViewModel
class SplashVM @Inject constructor(
    private val heroesRepository: HeroesRepository
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    var roles: BehaviorSubject<List<RoleEntity>> = BehaviorSubject.create()

    var isLoading: PublishSubject<Boolean> = PublishSubject.create()

    var toastMessage: PublishSubject<String> = PublishSubject.create()

    init {
        getRoles()
    }

    private fun getRoles() {
        heroesRepository.getRoles()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { isLoading.onNext(true) }
            .doFinally { isLoading.onNext(false) }
            .subscribe({ response ->
                when (response) {
                    is APIResult.Success -> {
                        // TODO: 로컬 DB에 저장 시킨 후 메인으로 이동
                        roles.onNext(response.data.toMutableList())
                    }

                    is APIResult.Error -> {
                        toastMessage.onNext(response.error.msg)
                    }
                }
            }, { error ->
                Log.e(this.javaClass.simpleName, error.toString())
            })
            .also { compositeDisposable.add(it) }
    }

    override fun onCleared() {
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.clear()
        }
        super.onCleared()
    }
}