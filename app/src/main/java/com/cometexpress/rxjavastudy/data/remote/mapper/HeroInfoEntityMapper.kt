package com.cometexpress.rxjavastudy.data.remote.mapper

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.EntityMapper
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoAbility
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoChapter
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoDTO
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoHitpoints
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoLink
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoMedia
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoStory
import com.cometexpress.rxjavastudy.data.remote.dto.heroes.HeroInfoVideo
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityAbility
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityChapter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityHitpoints
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityLink
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityMedia
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityStory
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityVideo

object HeroInfoEntityMapper : EntityMapper<HeroInfoDTO, HeroInfoEntity> {

    override fun asEntity(dto: HeroInfoDTO): HeroInfoEntity {

        return HeroInfoEntity(
            key = dto.key,
            abilities = dto.abilities?.map { entity ->
                HeroInfoEntityAbility(
                    description = entity?.description ?: Constant.Server.DATA_ERROR_BY_STRING,
                    icon = entity?.icon ?: Constant.Server.DATA_ERROR_BY_STRING,
                    name = entity?.name ?: Constant.Server.DATA_ERROR_BY_STRING,
                    video = HeroInfoEntityVideo(
                        link = HeroInfoEntityLink(
                            mp4 = entity?.video?.link?.mp4 ?: Constant.Server.DATA_ERROR_BY_STRING,
                            webm = entity?.video?.link?.webm ?: Constant.Server.DATA_ERROR_BY_STRING
                        ),
                        thumbnail = entity?.video?.thumbnail ?: Constant.Server.DATA_ERROR_BY_STRING
                    )
                )
            } ?: listOf(),
            age = dto.age ?: Constant.Server.DATA_ERROR_BY_INT,
            birthday = dto.birthday ?: Constant.Server.DATA_ERROR_BY_STRING,
            description = dto.description ?: Constant.Server.DATA_ERROR_BY_STRING,
            hitpoints = HeroInfoEntityHitpoints(
                armor = dto.hitpoints?.armor ?: Constant.Server.DATA_ERROR_BY_INT,
                health = dto.hitpoints?.health ?: Constant.Server.DATA_ERROR_BY_INT,
                shields = dto.hitpoints?.shields ?: Constant.Server.DATA_ERROR_BY_INT,
                total = dto.hitpoints?.total ?: Constant.Server.DATA_ERROR_BY_INT,
            ),
            location = dto.location ?: Constant.Server.DATA_ERROR_BY_STRING,
            name = dto.name ?: Constant.Server.DATA_ERROR_BY_STRING,
            portrait = dto.portrait ?: Constant.Server.DATA_ERROR_BY_STRING,
            role = dto.role ?: Constant.Server.DATA_ERROR_BY_STRING,
            story = HeroInfoEntityStory(
                chapters = dto.story?.chapters?.map { chapter ->
                    HeroInfoEntityChapter(
                        content = chapter?.content ?: Constant.Server.DATA_ERROR_BY_STRING,
                        picture = chapter?.picture ?: Constant.Server.DATA_ERROR_BY_STRING,
                        title = chapter?.title ?: Constant.Server.DATA_ERROR_BY_STRING,
                    )
                } ?: listOf(),
                media = HeroInfoEntityMedia(
                    link = dto.story?.media?.link ?: Constant.Server.DATA_ERROR_BY_STRING,
                    type = dto.story?.media?.type ?: Constant.Server.DATA_ERROR_BY_STRING
                ),
                summary = dto.story?.summary ?: Constant.Server.DATA_ERROR_BY_STRING
            )
        )
    }

    override fun asDTO(entity: HeroInfoEntity): HeroInfoDTO {
        return HeroInfoDTO(
            key = entity.key,
            abilities = entity.abilities.map { ability ->
                HeroInfoAbility(
                    description = ability.description,
                    icon = ability.icon,
                    name = ability.name,
                    video = HeroInfoVideo(
                        link = HeroInfoLink(
                            mp4 = ability.video.link.mp4,
                            webm = ability.video.link.webm
                        ),
                        thumbnail = ability.video.thumbnail
                    )
                )
            },
            age = entity.age,
            birthday = entity.birthday,
            description = entity.description,
            hitpoints = HeroInfoHitpoints(
                armor = entity.hitpoints.armor,
                health = entity.hitpoints.health,
                shields = entity.hitpoints.shields,
                total = entity.hitpoints.total
            ),
            location = entity.location,
            name = entity.name,
            portrait = entity.portrait,
            role = entity.role,
            story = HeroInfoStory(
                chapters = entity.story.chapters.map { chapter ->
                    HeroInfoChapter(
                        content = chapter.content,
                        picture = chapter.picture,
                        title = chapter.title
                    )
                },
                media = HeroInfoMedia(
                    link = entity.story.media.link,
                    type = entity.story.media.type
                ),
                summary = entity.story.summary
            )
        )

    }
}

fun HeroInfoDTO.asEntity(): HeroInfoEntity {
    return HeroInfoEntityMapper.asEntity(this)
}

fun HeroInfoEntity.asDTO(): HeroInfoDTO {
    return HeroInfoEntityMapper.asDTO(this)
}