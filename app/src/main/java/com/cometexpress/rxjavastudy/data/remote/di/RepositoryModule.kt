package com.cometexpress.rxjavastudy.data.remote.di

import com.cometexpress.rxjavastudy.data.repository_impl.HeroesRepositoryImpl
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
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