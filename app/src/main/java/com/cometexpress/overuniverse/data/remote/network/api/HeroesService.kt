package com.cometexpress.overuniverse.data.remote.network.api

import com.cometexpress.overuniverse.data.remote.dto.heroes.HeroDTO
import com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoDTO
import com.cometexpress.overuniverse.data.remote.dto.heroes.RoleDTO
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HeroesService {

    @GET("roles")
    fun getRoles(): Single<Response<List<RoleDTO>>>

    @GET("heroes")
    fun getHeroes(
        @Query("role") role: String
    ): Single<Response<List<HeroDTO>>>

    @GET("heroes/{heroKey}")
    fun getHeroInfo(
        @Path(value = "heroKey") heroKey: String
    ): Single<Response<HeroInfoDTO>>
}