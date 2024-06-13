package com.cometexpress.overuniverse.presentation.splash

import androidx.lifecycle.ViewModel
import com.cometexpress.overuniverse.common.api.APIResult
import com.cometexpress.overuniverse.domain.repository.HeroesRepository
import com.orhanobut.logger.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.CompletableSubject
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@HiltViewModel
class SplashVM @Inject constructor(
    private val heroesRepository: HeroesRepository
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

//    var roles: BehaviorSubject<List<RoleEntity>> = BehaviorSubject.create()

    var completeRoles = CompletableSubject.create()

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
                        completeRoles.onComplete()
//                        roles.onNext(response.data.toMutableList())
                    }

                    is APIResult.Error -> {
                        toastMessage.onNext(response.error.msg)
                    }
                }
            }, { error ->
                Logger.e(error.localizedMessage ?: "")
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