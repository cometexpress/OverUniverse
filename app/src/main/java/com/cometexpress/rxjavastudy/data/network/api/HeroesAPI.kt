package com.cometexpress.rxjavastudy.data.network.api

import com.cometexpress.rxjavastudy.data.model.Hero
import com.cometexpress.rxjavastudy.data.network.APIService
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroesAPI: APIService {

    @GET("heroes")
    suspend fun getHeroes(
        @Query("role") role: String
    ): Response<List<Hero>>
}