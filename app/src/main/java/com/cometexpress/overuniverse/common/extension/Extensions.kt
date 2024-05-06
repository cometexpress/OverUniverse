package com.cometexpress.overuniverse.common.extension

import android.content.Context
import android.content.res.Resources
import android.util.DisplayMetrics


//dp를 px로 변환 (dp를 입력받아 px을 리턴)
fun Context.dpToPx(dp: Float): Int {
    val resources: Resources = this.resources
    val metrics = resources.displayMetrics
    val px = dp * (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    return px.toInt()
}

//px을 dp로 변환 (px을 입력받아 dp를 리턴)
fun Context.pxToDp(px: Float): Int {
    val resources: Resources = this.resources
    val metrics = resources.displayMetrics
    val dp = px / (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    return dp.toInt()
}