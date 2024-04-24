package com.cometexpress.overuniverse.data.repository_impl

import com.cometexpress.overuniverse.common.Constant
import com.cometexpress.overuniverse.common.api.APIError
import com.cometexpress.overuniverse.common.api.APIResult
import com.cometexpress.overuniverse.data.ErrorModel
import com.cometexpress.overuniverse.data.local.dao.HeroDao
import com.cometexpress.overuniverse.data.local.dao.HeroInfoDao
import com.cometexpress.overuniverse.data.local.dao.RoleDao
import com.cometexpress.overuniverse.data.remote.mapper.asEntity
import com.cometexpress.overuniverse.data.remote.network.api.HeroesService
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity
import com.cometexpress.overuniverse.domain.repository.HeroesRepository
import io.reactivex.Single
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

    override fun getHeroInfo(heroKey: String): Single<APIResult<HeroInfoEntity, ErrorModel>> {
        return heroInfoDao.loadByHeroKey(heroKey)
            .firstOrError()
            .flatMap { entity ->
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
                            APIResult.Error(ErrorModel(code = APIError.ServerError.code, msg = error.message ?: ""))
                        }
                } else {
                    Single.just(APIResult.Success(entity))
                }
            }
    }
}
