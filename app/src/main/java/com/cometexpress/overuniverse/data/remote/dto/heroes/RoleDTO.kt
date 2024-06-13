package com.cometexpress.overuniverse.data.remote.dto.heroes


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RoleDTO(
    @Json(name = "description")
    var description: String?,
    @Json(name = "icon")
    var icon: String?,
    @Json(name = "key")
    var key: String?,
    @Json(name = "name")
    var name: String?
)