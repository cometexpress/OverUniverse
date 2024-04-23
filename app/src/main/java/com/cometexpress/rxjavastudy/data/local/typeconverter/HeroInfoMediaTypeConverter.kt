package com.cometexpress.rxjavastudy.data.local.typeconverter

import androidx.room.TypeConverter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityMedia
import com.google.gson.Gson
import javax.inject.Inject

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