package com.cometexpress.rxjavastudy.data.remote.di

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.remote.network.NetworkUtil
import com.cometexpress.rxjavastudy.data.remote.network.api.HeroesService
import com.cometexpress.rxjavastudy.data.remote.network.interceptor.CommonInterceptor
import com.cometexpress.rxjavastudy.data.remote.network.interceptor.LoggingInterceptor
import com.cometexpress.rxjavastudy.data.repository_impl.HeroesRepositoryImpl
import com.cometexpress.rxjavastudy.domain.repository.HeroesRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(CommonInterceptor())
            .addInterceptor(LoggingInterceptor())
            .addInterceptor(LoggingInterceptor.httpInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(Constant.Server.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideHeroesService(retrofit: Retrofit): HeroesService {
        return retrofit.create(HeroesService::class.java)
    }
}