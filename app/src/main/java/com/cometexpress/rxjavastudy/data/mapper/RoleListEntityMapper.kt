package com.cometexpress.rxjavastudy.data.mapper

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.EntityMapper
import com.cometexpress.rxjavastudy.data.dto.heroes.RoleDTO
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity

object RoleListEntityMapper : EntityMapper<List<RoleDTO>, List<RoleEntity>> {
    override fun asEntity(dto: List<RoleDTO>): List<RoleEntity> {
        return dto.map { dto ->
            RoleEntity(
                key = dto.key ?: Constant.Server.DATA_ERROR,
                name = dto.name ?: Constant.Server.DATA_ERROR,
                description = dto.description ?: Constant.Server.DATA_ERROR,
                icon = dto.icon ?: Constant.Server.DATA_ERROR
            )
        }
    }

    override fun asDTO(entity: List<RoleEntity>): List<RoleDTO> {
        return entity.map { entity ->
            RoleDTO(
                key = entity.key,
                name = entity.name,
                description = entity.description,
                icon = entity.icon
            )
        }
    }
}

fun List<RoleDTO>.asEntity(): List<RoleEntity> {
    return RoleListEntityMapper.asEntity(this)
}

fun List<RoleEntity>.asDTO(): List<RoleDTO> {
    return RoleListEntityMapper.asDTO(this)
}