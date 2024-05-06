package com.cometexpress.overuniverse.domain.entity.heroes

import androidx.annotation.ColorRes
import com.cometexpress.overuniverse.R

enum class HeroHPType {
    NORMAL, ARMOR, SHIELD;
}

@ColorRes
fun HeroHPType.getColorResId(): Int {
    return when(this) {
        HeroHPType.NORMAL -> {
            R.color.progress_normal
        }
        HeroHPType.ARMOR -> {
            R.color.progress_armor
        }
        HeroHPType.SHIELD -> {
            R.color.progress_shields
        }
    }
}