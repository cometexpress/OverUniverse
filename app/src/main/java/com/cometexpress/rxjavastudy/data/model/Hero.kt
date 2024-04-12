package com.cometexpress.rxjavastudy.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hero(
    @Json(name = "key")
    var key: String?,
    @Json(name = "name")
    var name: String?,
    @Json(name = "portrait")
    var portrait: String?,
    @Json(name = "role")
    var role: String?
)

enum class HeroType(val role: String) {
    TANK("tank"), DAMAGE("damage"), SUPPORT("support");

    companion object {
        fun from(role: String): HeroType? = HeroType.entries.find { it.role == role }
    }
}