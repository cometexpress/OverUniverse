package com.cometexpress.overuniverse.presentation.main.hero_info

import androidx.lifecycle.ViewModel
import com.cometexpress.overuniverse.common.api.APIResult
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.overuniverse.domain.repository.HeroesRepository
import com.orhanobut.logger.Logger
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

    val heroInfo: PublishSubject<HeroInfoEntity> = PublishSubject.create()

    val toastMessage: PublishSubject<String> = PublishSubject.create()

    val isLoading = BehaviorSubject.createDefault(false)

    fun getHeroInfo(key: String) {

        if (isLoading.value == true) return

        heroesRepository.getHeroInfo(heroKey = key)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { isLoading.onNext(true) }
            .doFinally { isLoading.onNext(false) }
            .subscribe({ response ->
                when(response) {
                    is APIResult.Success -> heroInfo.onNext(response.data)
                    is APIResult.Error -> {
                        Logger.e(response.error.msg)
                        toastMessage.onNext(response.error.msg)
                    }
                }
            }, { error ->
                Logger.e(error.localizedMessage ?: "")
            })
            .also { compositeDisposable.add(it) }
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}