package com.cometexpress.rxjavastudy.data.repository_impl

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.common.api.APIError
import com.cometexpress.rxjavastudy.common.api.APIResult
import com.cometexpress.rxjavastudy.data.ErrorModel
import com.cometexpress.rxjavastudy.data.local.dao.HeroDao
import com.cometexpress.rxjavastudy.data.local.dao.HeroInfoDao
import com.cometexpress.rxjavastudy.data.local.dao.RoleDao
import com.cometexpress.rxjavastudy.data.remote.mapper.asEntity
import com.cometexpress.rxjavastudy.data.remote.network.api.HeroesService
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class HeroesRepositoryImpl @Inject constructor(
    private val apiService: HeroesService,
    private val roleDao: RoleDao,
    private val heroDao: HeroDao,
    private val heroInfoDao: HeroInfoDao,
): HeroesRepository {

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

    override fun getHeroes(role: String): Single<APIResult<List<HeroEntity>, ErrorModel>> {
        return heroDao.loadAllByRole(role)
            .firstOrError()
            .flatMap { list ->
                if (list.isEmpty()) {
                    apiService.getHeroes(role)
                        .map { response ->
                            if (response.isSuccessful && response.code() == Constant.Server.Code.SUCCESS) {
                                val data = response.body()
                                if (data != null) {
                                    val responseEntity = data.asEntity()
                                    heroDao.insertHeroList(responseEntity)

                                    responseEntity.map {
                                        heroInfoDao.insertHeroInfo(HeroInfoEntity(key = it.key))
                                    }

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

//    override fun getHeroInfo(heroKey: String): Single<APIResult<HeroInfoEntity, ErrorModel>> {
//        return apiService.getHeroInfo(heroKey)
//            .map { response ->
//                if (response.isSuccessful && response.code() == Constant.Server.Code.SUCCESS) {
//                    val data = response.body()
//                        ?: return@map APIResult.Error(ErrorModel(code = APIError.InvalidData.code, msg = APIError.InvalidData.message))
//
//                    val responseEntity = data.asEntity()
//                    heroInfoDao.insertHeroInfo(responseEntity)
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe()
//
//                    APIResult.Success(responseEntity)
//                } else {
//                    val code = response.code()
//                    val message = APIError.HeroesAPI.from(code)?.message ?: ""
//                    APIResult.Error(ErrorModel(code = code, msg = message))
//                }
//            }
//            .onErrorReturn { error ->
//                println("API 테스트 / ${error.stackTrace}")
//                APIResult.Error(ErrorModel(code = APIError.ServerError.code, msg = error.message ?: ""))
//            }
//    }

    // TODO: 오류 해결필요 , 현재 API 호출 안하는 중
    override fun getHeroInfo(heroKey: String): Single<APIResult<HeroInfoEntity, ErrorModel>> {
        return heroInfoDao.loadByHeroKey(heroKey)
            .firstOrError()
            .flatMap { entity ->
                println("API 테스트 / ${entity.toString()}")
                if (entity.name.isEmpty()) {
                    apiService.getHeroInfo(heroKey)
                        .map { response ->
                            if (response.isSuccessful && response.code() == Constant.Server.Code.SUCCESS) {
                                val data = response.body()
                                    ?: return@map APIResult.Error(ErrorModel(code = APIError.InvalidData.code, msg = APIError.InvalidData.message))

                                val responseEntity = data.asEntity()
                                responseEntity.key = heroKey
                                heroInfoDao.insertHeroInfo(responseEntity)

                                APIResult.Success(responseEntity)
                            } else {
                                val code = response.code()
                                val message = APIError.HeroesAPI.from(code)?.message ?: ""
                                APIResult.Error(ErrorModel(code = code, msg = message))
                            }
                        }
                        .onErrorReturn { error ->
                            println("API 테스트 / ${error.stackTrace}")
                            APIResult.Error(ErrorModel(code = APIError.ServerError.code, msg = error.message ?: ""))
                        }
                } else {
                    println("API 테스트 222 / ${entity.toString()}")
                    Single.just(APIResult.Success(entity))
                }
            }
    }
}
