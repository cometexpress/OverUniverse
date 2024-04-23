package com.cometexpress.rxjavastudy.data.local.typeconverter

import androidx.room.TypeConverter
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroInfoEntityAbility
import com.google.gson.Gson
import javax.inject.Inject

class HeroInfoAbilityTypeConverter {
    @TypeConverter
    fun fromAbilities(abilities: List<HeroInfoEntityAbility>): String {
        return Gson().toJson(abilities)
    }

    @TypeConverter
    fun toAbilities(abilitiesString: String): List<HeroInfoEntityAbility> {
        val abilitiesArray = Gson().fromJson(abilitiesString, Array<HeroInfoEntityAbility>::class.java)
        return abilitiesArray.toList()
    }
}