package com.cometexpress.rxjavastudy.data.local.di

import android.app.Application
import androidx.room.Room
import com.cometexpress.rxjavastudy.data.local.OverUniverseDatabase
import com.cometexpress.rxjavastudy.data.local.dao.HeroDao
import com.cometexpress.rxjavastudy.data.local.dao.HeroInfoDao
import com.cometexpress.rxjavastudy.data.local.dao.RoleDao
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        application: Application
    ): OverUniverseDatabase {
        return Room
            .databaseBuilder(application, OverUniverseDatabase::class.java, "OverUniverse.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

    @Provides
    @Singleton
    fun provideRoleDao(appDatabase: OverUniverseDatabase): RoleDao {
        return appDatabase.roleDao()
    }

    @Provides
    @Singleton
    fun provideHeroDao(appDatabase: OverUniverseDatabase): HeroDao {
        return appDatabase.heroDao()
    }

    @Provides
    @Singleton
    fun provideHeroInfoDao(appDatabase: OverUniverseDatabase): HeroInfoDao {
        return appDatabase.heroInfoDao()
    }

}