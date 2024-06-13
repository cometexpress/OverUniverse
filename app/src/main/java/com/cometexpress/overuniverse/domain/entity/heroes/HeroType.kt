package com.cometexpress.overuniverse.domain.entity.heroes

enum class HeroType(val role: String) {
    TANK("tank"), DAMAGE("damage"), SUPPORT("support");

    companion object {
        fun from(role: String): HeroType? = HeroType.entries.find { it.role == role }
    }
}