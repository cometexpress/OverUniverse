package com.cometexpress.rxjavastudy.domain.repository

import com.cometexpress.rxjavastudy.data.model.Hero
import io.reactivex.Single

interface HeroesRepository {
    fun getHeroes(role: String): Single<List<Hero>>
}