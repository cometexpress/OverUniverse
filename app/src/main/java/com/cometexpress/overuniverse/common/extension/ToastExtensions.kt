package com.cometexpress.overuniverse.common.extension

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, isLong: Boolean = false) {
    val toastLength = if (isLong) {
        Toast.LENGTH_LONG
    } else {
        Toast.LENGTH_SHORT
    }
    Toast.makeText(this, message, toastLength).show()
}