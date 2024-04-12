package com.cometexpress.rxjavastudy.domain.entity.heroes

data class HeroEntity(
    var key: String,
    var name: String,
    var image: String,
    var role: String
)

enum class HeroType(val role: String) {
    TANK("tank"), DAMAGE("damage"), SUPPORT("support");

    companion object {
        fun from(role: String): HeroType? = HeroType.entries.find { it.role == role }
    }
}