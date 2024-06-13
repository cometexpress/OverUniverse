package com.cometexpress.overuniverse.data.remote.di

import com.cometexpress.overuniverse.data.repository_impl.HeroesRepositoryImpl
import com.cometexpress.overuniverse.domain.repository.HeroesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideHeroesRepository(repositoryImpl: HeroesRepositoryImpl): HeroesRepository

}