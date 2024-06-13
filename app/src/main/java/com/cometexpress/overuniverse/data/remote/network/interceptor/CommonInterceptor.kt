package com.cometexpress.overuniverse.data.remote.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class CommonInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val originRequest = chain.request()

        // 공통 파라미터 추가
        val addParamsUrl = originRequest.url.newBuilder()
            .addQueryParameter("locale", "ko-kr")
            .build()

        // 공통 헤더 추가
        val newRequest = originRequest.newBuilder()
            .addHeader("Connection", "Keep-Alive")
            .addHeader("Content-Type", "application/json")
            .url(addParamsUrl)
            .build()

        return chain.proceed(newRequest)
    }

}