package com.cometexpress.rxjavastudy.domain.repository

import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.model.Hero
import com.cometexpress.rxjavastudy.data.model.ErrorModel
import io.reactivex.Single

interface HeroesRepository {
    fun getHeroes(role: String): Single<APIResult<List<Hero>, ErrorModel>>
}