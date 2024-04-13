package com.cometexpress.rxjavastudy.data.local.di

import android.app.Application
import androidx.room.Room
import com.cometexpress.rxjavastudy.data.local.dao.RoleDao
import com.cometexpress.rxjavastudy.data.local.OverUniverseDatabase
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
        application: Application,
    ): OverUniverseDatabase {
        return Room
            .databaseBuilder(application, OverUniverseDatabase::class.java, "OverUniverse.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providePokemonDao(appDatabase: OverUniverseDatabase): RoleDao {
        return appDatabase.roleDao()
    }

}