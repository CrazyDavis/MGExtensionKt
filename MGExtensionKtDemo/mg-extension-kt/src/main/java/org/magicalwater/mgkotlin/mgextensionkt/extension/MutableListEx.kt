package org.magicalwater.mgkotlin.mgextensionkt

/**
 * Created by magicalwater on 2017/12/25.
 */

//快速刪除最後一筆資料
fun <T> MutableList<T>.removeLast(): T = removeAt(size-1)
