package com.cometexpress.overuniverse.common.api

import com.cometexpress.overuniverse.data.ErrorModel

sealed class APIResult <out T : Any, out U : ErrorModel> {
    data class Success <T: Any>(val data : T) : APIResult<T, Nothing>()
    data class Error <U: ErrorModel>(val error: U) : APIResult<Nothing, U>()
}