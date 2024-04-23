package com.cometexpress.rxjavastudy.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.cometexpress.rxjavastudy.data.local.dao.HeroDao
import com.cometexpress.rxjavastudy.data.local.dao.HeroInfoDao
import com.cometexpress.rxjavastudy.data.local.dao.RoleDao
import com.cometexpress.rxjavastudy.data.local.typeconverter.HeroInfoAbilityTypeConverter
import com.cometexpress.rxjavastudy.data.local.typeconverter.HeroInfoChapterTypeConverter
import com.cometexpress.rxjavastudy.data.local.typeconverter.HeroInfoHitpointsTypeConverter
import com.cometexpress.rxjavastudy.data.local.typeconverter.HeroInfoMediaTypeConverter
import com.cometexpress.rxjavastudy.data.local.typeconverter.HeroInfoStoryTypeConverter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.rxjavastudy.domain.entity.heroes.RoleEntity

@Database(
    entities = [
        RoleEntity::class,
        HeroEntity::class,
        HeroInfoEntity::class
    ],
    version = 1
)

@TypeConverters(
    value = [
        HeroInfoHitpointsTypeConverter::class,
        HeroInfoAbilityTypeConverter::class,
        HeroInfoStoryTypeConverter::class,
        HeroInfoMediaTypeConverter::class,
        HeroInfoChapterTypeConverter::class
    ]
)
abstract class OverUniverseDatabase : RoomDatabase() {
    abstract fun roleDao(): RoleDao

    abstract fun heroDao(): HeroDao

    abstract fun heroInfoDao(): HeroInfoDao
}