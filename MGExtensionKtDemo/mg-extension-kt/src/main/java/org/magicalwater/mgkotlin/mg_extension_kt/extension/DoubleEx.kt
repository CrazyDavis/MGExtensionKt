package com.mgwater.mgbaseproject.extension

/**
 * Created by magicalwater on 2018/2/10.
 */

//val Double.clean: String
//    get() {
//        if (this.toInt().toDouble() == this) {
//
//        }
//    }

//自動取到第幾位小數點
fun Double.cleanText(decimal: Int): String = String.format("%.${decimal}f", this)