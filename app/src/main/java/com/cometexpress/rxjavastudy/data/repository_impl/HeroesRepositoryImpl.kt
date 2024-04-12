package com.cometexpress.rxjavastudy.data.repository_impl

import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.network.api.HeroesService
import com.cometexpress.rxjavastudy.common.api.APIError
import com.cometexpress.rxjavastudy.data.mapper.asEntity
import com.cometexpress.rxjavastudy.data.ErrorModel
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import io.reactivex.Single
import javax.inject.Inject

class HeroesRepositoryImpl @Inject constructor(
    private val apiService: HeroesService
): HeroesRepository {

    override fun getHeroes(role: String): Single<APIResult<List<HeroEntity>, ErrorModel>> {
        return apiService.getHeroes(role)
            .map { response ->
                if (response.isSuccessful && response.code() == 200) {
                    val data = response.body()
                    if (data != null) {
                        APIResult.Success(data.asEntity())
                    } else {
                        APIResult.Error(
                            ErrorModel(code = APIError.InvalidData.code, msg = APIError.InvalidData.message)
                        )
                    }
                } else {
                    val code = response.code()
                    // enum 값을 통해 message 찾도록 추가
                    val message = APIError.HeroesAPI.entries.firstOrNull { it.code == code }?.message ?: ""
                    APIResult.Error(
                        ErrorModel(code = code, msg = message)
                    )
                }
            }
            .onErrorReturn { error: Throwable ->
                APIResult.Error(
                    ErrorModel(code = APIError.ServerError.code, msg = error.message.toString())
                )
            }
    }
}
