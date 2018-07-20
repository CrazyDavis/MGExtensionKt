package com.mgwater.mgbaseproject.extension

import android.content.res.Resources

/**
 * Created by 志朋 on 2017/12/13.
 */

val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()