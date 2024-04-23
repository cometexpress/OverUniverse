package com.cometexpress.rxjavastudy.data.local.typeconverter

import androidx.room.TypeConverter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityHitpoints
import com.google.gson.Gson
import javax.inject.Inject

class HeroInfoHitpointsTypeConverter {
    @TypeConverter
    fun fromHitpoints(hitpoints: HeroInfoEntityHitpoints): String {
        return Gson().toJson(hitpoints)
    }

    @TypeConverter
    fun toHitpoints(hitpointsString: String): HeroInfoEntityHitpoints {
        return Gson().fromJson(hitpointsString, HeroInfoEntityHitpoints::class.java)
    }
}