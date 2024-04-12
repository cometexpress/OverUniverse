package com.cometexpress.rxjavastudy.domain.repository

import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.ErrorModel
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import io.reactivex.Single

interface HeroesRepository {
    fun getHeroes(role: String): Single<APIResult<List<HeroEntity>, ErrorModel>>
}