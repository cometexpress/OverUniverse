package com.cometexpress.rxjavastudy.data.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.internal.concurrent.TaskRunner.Companion.logger
import java.io.IOException

class LoggingInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val originRequest = chain.request()

        // 로그 출력
        val t1 = System.nanoTime()
        logger.info(String.format("Sending request %s on %s%n%s",
            originRequest.url, chain.connection(), originRequest.headers
        ))

        val response = chain.proceed(originRequest)

        val t2 = System.nanoTime()
        logger.info(String.format("Received response for %s in %.1fms%n%s",
            response.request.url, (t2 - t1) / 1e6, response.headers
        ))

        return response
    }

}