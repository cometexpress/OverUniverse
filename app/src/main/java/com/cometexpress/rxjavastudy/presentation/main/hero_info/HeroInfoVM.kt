package com.cometexpress.rxjavastudy.presentation.main.hero_info

import android.util.Log
import androidx.lifecycle.ViewModel
import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@HiltViewModel
class HeroInfoVM @Inject constructor(
    private val heroesRepository: HeroesRepository
): ViewModel() {

    private val compositeDisposable = CompositeDisposable()

//    val heroInfo = BehaviorSubject.createDefault(HeroInfoEntity())
    val heroInfo: PublishSubject<HeroInfoEntity> = PublishSubject.create()

    val toastMessage: PublishSubject<String> = PublishSubject.create()

    val isLoading: PublishSubject<Boolean> = PublishSubject.create()

    fun getHeroInfo(key: String) {
        heroesRepository.getHeroInfo(heroKey = key)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { isLoading.onNext(true) }
            .doFinally { isLoading.onNext(false) }
            .subscribe({ response ->

                when(response) {
                    is APIResult.Success -> heroInfo.onNext(response.data)
                    is APIResult.Error -> {
                        Log.e("error", response.error.msg)
                        toastMessage.onNext(response.error.msg)
                    }
                }
            }, { error ->
                Log.e(this.javaClass.simpleName, error.toString())
            })
            .also { compositeDisposable.add(it) }
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}