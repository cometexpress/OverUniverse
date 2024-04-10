package com.cometexpress.rxjavastudy.data.repository_impl

import com.cometexpress.rxjavastudy.data.model.Hero
import com.cometexpress.rxjavastudy.data.network.api.HeroesAPI
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import io.reactivex.Single

class HeroesRepositoryImpl(private val apiService: HeroesAPI) : HeroesRepository {

    override fun getHeroes(role: String): Single<List<Hero>> {
        return apiService.getHeroes(role)
            .map { response ->
                if (response.isSuccessful) {
                    val data = response.body()
                    if (data != null) {
                        return@map data
                    } else {
                        throw Exception("응답 데이터: null")
                    }
                } else {
                    throw Exception("통신 오류: ${response.code()}")
                }
            }
            .onErrorResumeNext { error: Throwable ->
                Single.error(Exception("${error.message}"))
            }
    }
}
