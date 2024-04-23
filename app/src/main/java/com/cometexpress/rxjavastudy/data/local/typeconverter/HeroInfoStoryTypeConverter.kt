package com.cometexpress.rxjavastudy.data.local.typeconverter

import androidx.room.TypeConverter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityStory
import com.google.gson.Gson
import javax.inject.Inject

class HeroInfoStoryTypeConverter {
    @TypeConverter
    fun fromStory(story: HeroInfoEntityStory): String {
        return Gson().toJson(story)
    }

    @TypeConverter
    fun toStory(storyString: String): HeroInfoEntityStory {
        return Gson().fromJson(storyString, HeroInfoEntityStory::class.java)
    }
}