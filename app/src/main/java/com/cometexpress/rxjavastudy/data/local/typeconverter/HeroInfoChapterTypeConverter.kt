package com.cometexpress.rxjavastudy.data.local.typeconverter

import androidx.room.TypeConverter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityChapter
import com.google.gson.Gson
import javax.inject.Inject

class HeroInfoChapterTypeConverter {
    @TypeConverter
    fun fromChapters(chapters: List<HeroInfoEntityChapter>): String {
        return Gson().toJson(chapters)
    }

    @TypeConverter
    fun toChapters(chaptersString: String): List<HeroInfoEntityChapter> {
        val chaptersArray = Gson().fromJson(chaptersString, Array<HeroInfoEntityChapter>::class.java)
        return chaptersArray.toList()
    }
}