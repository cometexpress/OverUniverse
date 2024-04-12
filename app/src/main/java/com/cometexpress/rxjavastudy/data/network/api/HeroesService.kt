package com.cometexpress.rxjavastudy.data.network.api

import com.cometexpress.rxjavastudy.data.dto.HeroDTO
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroesService {

    @GET("heroes")
    fun getHeroes(
        @Query("role") role: String
    ): Single<Response<List<HeroDTO>>>

}