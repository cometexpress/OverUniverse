package com.cometexpress.rxjavastudy.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cometexpress.rxjavastudy.data.local.dao.RoleDao
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity

@Database(entities = [RoleEntity::class], version = 1)
abstract class OverUniverseDatabase : RoomDatabase() {
    abstract fun roleDao(): RoleDao
}