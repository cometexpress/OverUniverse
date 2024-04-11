package com.cometexpress.rxjavastudy.presentation.heroes

import android.util.Log
import androidx.lifecycle.ViewModel
import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.model.Hero
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@HiltViewModel
class HeroesVM @Inject constructor(
    private val heroesRepository: HeroesRepository
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    var heroes: BehaviorSubject<MutableList<Hero>> = BehaviorSubject.create()

    var toastMessage: PublishSubject<String> = PublishSubject.create()

    var isLoading: PublishSubject<Boolean> = PublishSubject.create()

    fun getHeroes(role: String) {
        heroesRepository.getHeroes(role)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { isLoading.onNext(true) }
            .doFinally { isLoading.onNext(false) }
            .subscribe({ response ->
                when (response) {
                    is APIResult.Success -> {
                        heroes.onNext(response.data.toMutableList())
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

}