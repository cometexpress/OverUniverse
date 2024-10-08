package com.cometexpress.overuniverse.domain.entity.heroes

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


// HP 한칸당 탱커는 25, 딜러,힐러는 50
fun HeroInfoEntity.getHpSize(): Int {
    return if (role == HeroType.TANK.role) {
        25
    } else {
        50
    }
}

@Entity
data class HeroInfoEntity(
    @PrimaryKey var key: String = "",
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
    constructor(key: String): this(
        key,
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
    var video: HeroInfoEntityVideo,
    var playWhenReady: Boolean = false
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
