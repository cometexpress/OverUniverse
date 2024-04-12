package com.cometexpress.rxjavastudy.data.mapper

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.EntityMapper
import com.cometexpress.rxjavastudy.data.dto.HeroDTO
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity

object HeroListEntityMapper : EntityMapper<List<HeroDTO>, List<HeroEntity>> {
    override fun asEntity(dto: List<HeroDTO>): List<HeroEntity> {
        return dto.map { dto ->
            HeroEntity(
                key = dto.key ?: Constant.Server.DATA_ERROR,
                name = dto.name ?: Constant.Server.DATA_ERROR,
                image = dto.portrait ?: Constant.Server.DATA_ERROR,
                role = dto.role ?: Constant.Server.DATA_ERROR
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