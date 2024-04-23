package com.cometexpress.rxjavastudy.domain.repository

import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.ErrorModel
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity
import io.reactivex.Single

interface HeroesRepository {

    fun getRoles(): Single<APIResult<List<RoleEntity>, ErrorModel>>
    fun getHeroes(role: String): Single<APIResult<List<HeroEntity>, ErrorModel>>
    fun getHeroInfo(heroKey: String): Single<APIResult<HeroInfoEntity, ErrorModel>>
}