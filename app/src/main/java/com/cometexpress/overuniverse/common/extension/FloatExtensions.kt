package com.cometexpress.overuniverse.common.extension

import android.content.res.Resources

fun Float.fromDpToPx(): Int =
    (this * Resources.getSystem().displayMetrics.density).toInt()