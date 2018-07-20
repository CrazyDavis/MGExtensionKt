package com.mgwater.mgbaseproject.extension

import android.content.res.TypedArray

/**
 * Created by 志朋 on 2017/12/14.
 */

fun TypedArray.getColor(index: Int): Int? {
    val clr = this.getColor(index, -1001)
    return if (clr == -1001) null else clr
}

fun TypedArray.getResourceId(index: Int): Int? {
    val res = this.getResourceId(index, -1001)
    return if (res == -1001) null else res
}

fun TypedArray.getInteger(index: Int): Int? {
    val integer = this.getInteger(index, -1001)
    return if (integer == -1001) null else integer
}

fun TypedArray.getDimensionPixelSize(index: Int): Int? {
    val dimen = this.getDimensionPixelSize(index, -1001)
    return if (dimen == -1001) null else dimen
}