package com.cometexpress.rxjavastudy.data.repository_impl

import com.cometexpress.rxjavastudy.data.model.Hero
import com.cometexpress.rxjavastudy.data.network.api.HeroesAPI
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HeroesRepositoryImpl(private val apiService: HeroesAPI): HeroesRepository {
    override fun getHeroes(role: String): Single<List<Hero>> {
        return apiService.getHeroes(role)
    }

}