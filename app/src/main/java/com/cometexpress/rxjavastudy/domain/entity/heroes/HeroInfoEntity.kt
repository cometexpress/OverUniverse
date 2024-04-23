package com.cometexpress.rxjavastudy.domain.entity.heroes

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cometexpress.rxjavastudy.common.Constant

@Entity
data class HeroInfoEntity(
    @PrimaryKey var key: String,
    var abilities: List<HeroInfoEntityAbility>,
    var age: Int,
    var birthday: String,
    var description: String,
    var hitpoints: HeroInfoEntityHitpoints,
    var location: String,
    var name: String,
    var portrait: String,
    var role: String,
    var story: HeroInfoEntityStory
) {
    constructor(): this(
        Constant.Server.DATA_ERROR_BY_STRING,
        listOf(),
        0,
        "",
        "",
        HeroInfoEntityHitpoints(),
        "",
        "",
        "",
        "",
        HeroInfoEntityStory()
    )
}

data class HeroInfoEntityAbility(
    var description: String,
    var icon: String,
    var name: String,
    var video: HeroInfoEntityVideo
)

data class HeroInfoEntityChapter(
    var content: String,
    var picture: String,
    var title: String
)

data class HeroInfoEntityHitpoints(
    var armor: Int,
    var health: Int,
    var shields: Int,
    var total: Int
) {
    constructor(): this(0, 0, 0, 0)
}

data class HeroInfoEntityLink(
    var mp4: String,
    var webm: String
)

data class HeroInfoEntityMedia(
    var link: String,
    var type: String
) {
    constructor(): this("", "")
}

data class HeroInfoEntityStory(
    var chapters: List<HeroInfoEntityChapter>,
    var media: HeroInfoEntityMedia,
    var summary: String
) {
    constructor(): this(listOf(), HeroInfoEntityMedia(), "")
}

data class HeroInfoEntityVideo(
    var link: HeroInfoEntityLink,
    var thumbnail: String
)
