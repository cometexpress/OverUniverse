package com.cometexpress.overuniverse.data

interface EntityMapper<DTO, Entity> {

    fun asEntity(dto: DTO): Entity

    fun asDTO(entity: Entity): DTO
}