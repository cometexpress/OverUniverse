package com.cometexpress.rxjavastudy.data.remote.network

import com.cometexpress.rxjavastudy.common.Constant
import com.cometexpress.rxjavastudy.data.remote.network.interceptor.CommonInterceptor
import com.cometexpress.rxjavastudy.data.remote.network.interceptor.LoggingInterceptor
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * DI 적용 전 사용 했던 Util
 */
object NetworkUtil {

    val client: Retrofit by lazy {
        val baseUrl = Constant.Server.BASE_URL
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(httpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    private val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    private val httpClient = OkHttpClient.Builder()
        .addInterceptor(CommonInterceptor())
        .addInterceptor(LoggingInterceptor())
        .addInterceptor(LoggingInterceptor.httpInterceptor)
        .build()

    inline fun <reified T: APIService> getAPI(): T {
        return client.create(T::class.java)
    }
}