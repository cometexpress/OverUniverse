package com.cometexpress.overuniverse.domain.repository

import com.cometexpress.overuniverse.common.api.APIResult
import com.cometexpress.overuniverse.data.ErrorModel
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity
import io.reactivex.Single

interface HeroesRepository {

    fun getRoles(): Single<APIResult<List<RoleEntity>, ErrorModel>>
    fun getHeroes(role: String): Single<APIResult<List<HeroEntity>, ErrorModel>>
    fun getHeroInfo(heroKey: String): Single<APIResult<HeroInfoEntity, ErrorModel>>
}