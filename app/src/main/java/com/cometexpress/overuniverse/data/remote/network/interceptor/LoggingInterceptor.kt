package com.cometexpress.overuniverse.data.remote.network.interceptor

import com.cometexpress.overuniverse.common.extension.isJsonArray
import com.cometexpress.overuniverse.common.extension.isJsonObject
import com.orhanobut.logger.Logger
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.internal.concurrent.TaskRunner.Companion.logger
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import java.io.IOException

class LoggingInterceptor : Interceptor {

    companion object {

        private var isShowLog = true

        val httpInterceptor = HttpLoggingInterceptor { message ->
            when {
                message.isJsonObject() -> {
                    if(isShowLog) {
                        Logger.d(JSONObject(message).toString(4))
                    }
                }

                message.isJsonArray() -> {
                    if(isShowLog) {
                        Logger.d(JSONObject(message).toString(4))
                    }
                }

                else -> {
                    try {
                        if (isShowLog) {
                            Logger.d("else " + JSONObject(message).toString(4))
                        }
                    } catch (e: Exception) {
                        Logger.e("else $message")
                    }
                }
            }
        }
    }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val originRequest = chain.request()

        // 응답시간 출력
        val t1 = System.nanoTime()
        if(isShowLog) {
            logger.info(String.format("Sending request %s on %s%n%s",
                originRequest.url, chain.connection(), originRequest.headers
            ))
        }
        val response = chain.proceed(originRequest)

        val t2 = System.nanoTime()

        if(isShowLog) {
            logger.info(String.format("Received response for %s in %.1fms%n%s",
                response.request.url, (t2 - t1) / 1e6, response.headers
            ))
        }
        return response
    }
}