package com.cometexpress.rxjavastudy.common.api

sealed class APIError{
    data object InvalidData : APIError() { // data == null
        override val message = "알 수 없는 데이터"
    }
    data object NetworkError : APIError() { // 통신 오류
        override val message = "통신 오류"
    }
    data object ServerError: APIError() { // 서버 장애
        override val message = "서버 오류"
    }
    data class Code(val errorCode: Int, val errorMsg: String) : APIError()

    val code: Int
        get() = when (this) {
            is InvalidData -> 600
            is NetworkError -> 601
            is ServerError -> 603
            is Code -> errorCode
        }

    open val message: String
        get() = when(this) {
            is InvalidData -> InvalidData.message
            is NetworkError -> NetworkError.message
            is ServerError -> ServerError.message
            is Code -> errorMsg
        }

    enum class HeroesAPI(val code: Int, val message: String) {
        ValidationError(422, "잘못된 요청 입니다"),
        InternalServerError(500, "인터넷 서버 오류 입니다"),
        BlizzardServerError(504, "블리자드 서버 오류 입니다")
        ;
    }
}






