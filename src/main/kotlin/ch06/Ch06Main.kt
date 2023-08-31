package ch06

fun main() {
    println(strLen(null))
    println(fooAsLong(1L))
}

fun strLen(s: String?): Int? {
    return s?.length
}

fun strLenSafe(s: String?): Int {
    return s?.length ?: 0
}

fun strLenReturnDir(s: String?): Int {
    val length = s?.length ?: return 0
    return length + 1
}

fun fooAsLong(s: Any?): Long {
    val long = s as? Long ?: return 0
    return s.toLong()
}


