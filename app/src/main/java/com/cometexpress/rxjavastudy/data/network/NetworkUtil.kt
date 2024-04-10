package com.cometexpress.rxjavastudy.data.network

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.network.interceptor.CommonInterceptor
import com.cometexpress.rxjavastudy.data.network.interceptor.LoggingInterceptor
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkUtil {

    val client: Retrofit by lazy {
        val baseUrl = Constant.Server.BASE_URL
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(httpClient)
            .build()
    }

    private val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    private val httpClient = OkHttpClient.Builder()
        .addInterceptor(CommonInterceptor())
        .addInterceptor(LoggingInterceptor())
        .build()

    inline fun <reified T: APIService> getAPI(): T {
        return client.create(T::class.java)
    }
}