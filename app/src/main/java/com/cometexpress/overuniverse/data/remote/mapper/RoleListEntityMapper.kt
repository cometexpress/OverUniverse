package com.cometexpress.overuniverse.data.remote.mapper

import com.cometexpress.overuniverse.common.Constant
import com.cometexpress.overuniverse.data.EntityMapper
import com.cometexpress.overuniverse.data.remote.dto.heroes.RoleDTO
import com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity

object RoleListEntityMapper : EntityMapper<List<RoleDTO>, List<RoleEntity>> {
    override fun asEntity(dto: List<RoleDTO>): List<RoleEntity> {
        return dto.map { dto ->
            RoleEntity(
                key = dto.key ?: Constant.Server.DATA_ERROR_BY_STRING,
                name = dto.name ?: Constant.Server.DATA_ERROR_BY_STRING,
                description = dto.description ?: Constant.Server.DATA_ERROR_BY_STRING,
                icon = dto.icon ?: Constant.Server.DATA_ERROR_BY_STRING
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