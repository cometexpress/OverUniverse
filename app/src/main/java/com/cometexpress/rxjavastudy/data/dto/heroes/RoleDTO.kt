package com.cometexpress.rxjavastudy.data.dto.heroes


import com.google.gson.annotations.SerializedName

data class RoleDTO(
    @SerializedName("description")
    var description: String?,
    @SerializedName("icon")
    var icon: String?,
    @SerializedName("key")
    var key: String?,
    @SerializedName("name")
    var name: String?
)