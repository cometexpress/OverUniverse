package com.cometexpress.rxjavastudy.domain.entity.heroes

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoleEntity(
    @PrimaryKey val key: String,
    val description: String,
    val icon: String,
    val name: String
)