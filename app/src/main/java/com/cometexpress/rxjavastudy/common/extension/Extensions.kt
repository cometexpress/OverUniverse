package com.cometexpress.rxjavastudy.common.extension

/* 문자열이 json object 인지 확인 */
fun String?.isJsonObject(): Boolean {
    return this?.startsWith("{") == true && this.endsWith("}")
}

/* 문자열이 json array 인지 확인 */
fun String?.isJsonArray(): Boolean {
    return this?.startsWith("[") == true && this.endsWith("]")
}