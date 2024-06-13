package com.cometexpress.overuniverse.domain.entity.heroes

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HeroEntity(
    @PrimaryKey val key: String,
    val name: String,
    val image: String,
    val role: String
)