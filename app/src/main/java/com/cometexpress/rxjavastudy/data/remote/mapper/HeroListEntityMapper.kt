package com.cometexpress.rxjavastudy.data.remote.mapper

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.EntityMapper
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroDTO
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity

object HeroListEntityMapper : EntityMapper<List<HeroDTO>, List<HeroEntity>> {
    override fun asEntity(dto: List<HeroDTO>): List<HeroEntity> {
        return dto.map { dto ->
            HeroEntity(
                key = dto.key ?: Constant.Server.DATA_ERROR_BY_STRING,
                name = dto.name ?: Constant.Server.DATA_ERROR_BY_STRING,
                image = dto.portrait ?: Constant.Server.DATA_ERROR_BY_STRING,
                role = dto.role ?: Constant.Server.DATA_ERROR_BY_STRING
            )
        }
    }

    override fun asDTO(entity: List<HeroEntity>): List<HeroDTO> {
        return entity.map { entity ->
            HeroDTO(
                key = entity.key,
                name = entity.name,
                portrait = entity.image,
                role = entity.role
            )
        }
    }
}

fun List<HeroDTO>.asEntity(): List<HeroEntity> {
    return HeroListEntityMapper.asEntity(this)
}

fun List<HeroEntity>.asDTO(): List<HeroDTO> {
    return HeroListEntityMapper.asDTO(this)
}