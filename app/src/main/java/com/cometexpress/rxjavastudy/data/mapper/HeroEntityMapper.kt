package com.cometexpress.rxjavastudy.data.mapper

//object HeroEntityMapper : EntityMapper<HeroDTO, HeroEntity> {
//    override fun asEntity(dto: HeroDTO): HeroEntity {
//        return HeroEntity(
//            key = dto.key ?: Constant.Server.DATA_ERROR,
//            name = dto.name ?: Constant.Server.DATA_ERROR,
//            image = dto.portrait ?: Constant.Server.DATA_ERROR,
//            role = dto.role ?: Constant.Server.DATA_ERROR
//        )
//    }
//
//    override fun asDTO(entity: HeroEntity): HeroDTO {
//        return HeroDTO(
//            key = entity.key,
//            name = entity.name,
//            portrait = entity.image,
//            role = entity.role
//        )
//    }
//}
//
//fun HeroDTO.asEntity(): HeroEntity {
//    return HeroEntityMapper.asEntity(this)
//}
//
//fun HeroEntity.asDTO(): HeroDTO {
//    return HeroEntityMapper.asDTO(this)
//}