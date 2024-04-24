package com.cometexpress.overuniverse.presentation.main.heroes

import androidx.lifecycle.ViewModel
import com.cometexpress.overuniverse.common.api.APIResult
import com.cometexpress.overuniverse.data.ErrorModel
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity
import com.cometexpress.overuniverse.domain.entity.heroes.HeroType
import com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity
import com.cometexpress.overuniverse.domain.repository.HeroesRepository
import com.orhanobut.logger.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.Observable
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

    private var _roles: List<RoleEntity> = listOf()
    val roles: BehaviorSubject<List<RoleEntity>> = BehaviorSubject.create()

    val allHeroes: BehaviorSubject<List<HeroEntity>> = BehaviorSubject.create()

    val toastMessage: PublishSubject<String> = PublishSubject.create()

    val isLoading: PublishSubject<Boolean> = PublishSubject.create()

    private val _arrError = mutableListOf<ErrorModel>()

    init {
        getAllData()
    }

    private fun getAllData() {
        val rolesObservable = heroesRepository.getRoles().toObservable()
        val tankObservable = getHeroes(HeroType.TANK.role)
        val damageObservable = getHeroes(HeroType.DAMAGE.role)
        val supportObservable = getHeroes(HeroType.SUPPORT.role)

        Observable.zip(
            rolesObservable,tankObservable,damageObservable,supportObservable
        ) { rolesResponse, tankHeroesResponse, damageHeroesResponse, supportHeroesResponse ->

            when(rolesResponse) {
                is APIResult.Success -> _roles = rolesResponse.data
                is APIResult.Error -> _arrError.add(rolesResponse.error)
            }

            val _allHeroes = mutableListOf<HeroEntity>()

            when(tankHeroesResponse) {
                is APIResult.Success -> _allHeroes.addAll(tankHeroesResponse.data)
                is APIResult.Error -> _arrError.add(tankHeroesResponse.error)
            }
            when(damageHeroesResponse) {
                is APIResult.Success -> _allHeroes.addAll(damageHeroesResponse.data)
                is APIResult.Error -> _arrError.add(damageHeroesResponse.error)
            }
            when(supportHeroesResponse) {
                is APIResult.Success -> _allHeroes.addAll(supportHeroesResponse.data)
                is APIResult.Error -> _arrError.add(supportHeroesResponse.error)
            }

            _allHeroes
        }
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { isLoading.onNext(true) }
            .doFinally { isLoading.onNext(false) }
            .subscribe({ heroes ->
                /**
                 * error 한번이라도 발생했을 때는 에러 토스트 출력
                 */
                if(_arrError.isNotEmpty()) {
                    toastMessage.onNext(_arrError[0].msg)
                } else {
                    roles.onNext(_roles)
                    allHeroes.onNext(heroes)
                }
            }, { error ->
                Logger.e(error.localizedMessage ?: "")
            })
            .also { compositeDisposable.add(it) }
    }

    private fun getHeroes(role: String): Observable<APIResult<List<HeroEntity>, ErrorModel>> {
        return heroesRepository.getHeroes(role)
            .toObservable()
            .subscribeOn(Schedulers.io())
    }

    private fun getRoles() {
        heroesRepository.getRoles()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                when(response) {
                    is APIResult.Success -> {
                        roles.onNext(response.data)
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