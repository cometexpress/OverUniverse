package com.cometexpress.overuniverse.data.remote.dto.heroes


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HeroInfoDTO(
    var key: String = "",    // 해당 키는 영웅 목록에서 가져와서 업데이트
    @Json(name = "abilities")
    var abilities: List<HeroInfoAbility?>?,
    @Json(name = "age")
    var age: Int?,
    @Json(name = "birthday")
    var birthday: String?,
    @Json(name = "description")
    var description: String?,
    @Json(name = "hitpoints")
    var hitpoints: HeroInfoHitpoints?,
    @Json(name = "location")
    var location: String?,
    @Json(name = "name")
    var name: String?,
    @Json(name = "portrait")
    var portrait: String?,
    @Json(name = "role")
    var role: String?,
    @Json(name = "story")
    var story: HeroInfoStory?
)

data class HeroInfoChapter(
    @Json(name = "content")
    var content: String?,
    @Json(name = "picture")
    var picture: String?,
    @Json(name = "title")
    var title: String?
)

data class HeroInfoAbility(
    @Json(name = "description")
    var description: String?,
    @Json(name = "icon")
    var icon: String?,
    @Json(name = "name")
    var name: String?,
    @Json(name = "video")
    var video: HeroInfoVideo?
)

data class HeroInfoHitpoints(
    @Json(name = "armor")
    var armor: Int?,
    @Json(name = "health")
    var health: Int?,
    @Json(name = "shields")
    var shields: Int?,
    @Json(name = "total")
    var total: Int?
)

data class HeroInfoLink(
    @Json(name = "mp4")
    var mp4: String?,
    @Json(name = "webm")
    var webm: String?
)

data class HeroInfoMedia(
    @Json(name = "link")
    var link: String?,
    @Json(name = "type")
    var type: String?
)

data class HeroInfoStory(
    @Json(name = "chapters")
    var chapters: List<HeroInfoChapter?>?,
    @Json(name = "media")
    var media: HeroInfoMedia?,
    @Json(name = "summary")
    var summary: String?
)

data class HeroInfoVideo(
    @Json(name = "link")
    var link: HeroInfoLink?,
    @Json(name = "thumbnail")
    var thumbnail: String?
)