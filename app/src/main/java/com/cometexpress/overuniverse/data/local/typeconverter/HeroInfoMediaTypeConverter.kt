package com.cometexpress.overuniverse.data.local.typeconverter

import androidx.room.TypeConverter
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityMedia
import com.google.gson.Gson

class HeroInfoMediaTypeConverter {
    @TypeConverter
    fun fromMedia(media: HeroInfoEntityMedia): String {
        return Gson().toJson(media)
    }

    @TypeConverter
    fun toMedia(mediaString: String): HeroInfoEntityMedia {
        return Gson().fromJson(mediaString, HeroInfoEntityMedia::class.java)
    }
}