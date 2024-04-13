package com.cometexpress.rxjavastudy.data.repository_impl

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.common.api.APIError
import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.ErrorModel
import com.cometexpress.rxjavastudy.data.local.dao.RoleDao
import com.cometexpress.rxjavastudy.data.remote.mapper.asEntity
import com.cometexpress.rxjavastudy.data.remote.network.api.HeroesService
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class HeroesRepositoryImpl @Inject constructor(
    private val apiService: HeroesService,
    private val roleDao: RoleDao,
): HeroesRepository {

    override fun getHeroes(role: String): Single<APIResult<List<HeroEntity>, ErrorModel>> {
        return apiService.getHeroes(role)
            .map { response ->
                if (response.isSuccessful && response.code() == Constant.Server.Code.SUCCESS) {
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

    override fun getRoles(): Single<APIResult<List<RoleEntity>, ErrorModel>> {
        return roleDao.getAll()
            .firstOrError()
            .flatMap { list ->
                if (list.isEmpty()) {
                    apiService.getRoles()
                        .map { response ->
                            if (response.isSuccessful && response.code() == Constant.Server.Code.SUCCESS) {
                                val data = response.body()
                                if (data != null) {
                                    val responseEntity = data.asEntity()
                                    roleDao.insertRoleList(responseEntity)
                                        .subscribeOn(Schedulers.io())
                                        .observeOn(AndroidSchedulers.mainThread())
                                        .subscribe()
                                    APIResult.Success(responseEntity)
                                } else {
                                    APIResult.Error(ErrorModel(code = APIError.InvalidData.code, msg = APIError.InvalidData.message))
                                }
                            } else {
                                val code = response.code()
                                val message = APIError.HeroesAPI.from(code)?.message ?: ""
                                APIResult.Error(ErrorModel(code = code, msg = message))
                            }
                        }
                        .onErrorReturn { error ->
                            APIResult.Error(ErrorModel(code = APIError.ServerError.code, msg = error.message ?: ""))
                        }
                } else {
                    Single.just(APIResult.Success(list))
                }
            }
    }
}
