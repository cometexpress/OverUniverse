package com.cometexpress.rxjavastudy.data.network.api

import com.cometexpress.rxjavastudy.data.model.Hero
import com.cometexpress.rxjavastudy.data.network.APIService
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroesAPI: APIService {

    @GET("heroes")
    fun getHeroes(
        @Query("role") role: String
    ): Single<Response<List<Hero>>>

}

data class ErrorHeroesAPI(
    val code: Int,
    val message: String
)