package ch03

import java.lang.StringBuilder
import ch03.lastChar as lc

fun main() {
  val set = hashSetOf(1 to "one", 2 to "two")
  val map = hashMapOf(1 to "one", 2 to "two")

  val char = "Kotlin".lc()

  Ch03User(id = "1", name = "").validateByName()

  listToString()

//  print(listOf("1", "2").join())

//  println("12.456".split('.'))

  val path = "path/to/dir/filename.txt"
  val regex = """(.+)/(.+)\.(.+)""".toRegex()
  val matchResult = regex.matchEntire(path)
  if (matchResult != null) {
    val (directory, filename, extension) = matchResult.destructured
//    println("directory: $directory , filename: $filename , extension: $extension")
  }
}

fun listToString() {
  val list = listOf(1, 2, 3,)
  println(list.joinToString("; ", "(", ")"))
  println(list.joinToString(separator = "; ", postfix = ")", prefix = "("))
}

fun <T> Collection<T>.joinToString(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = "",
): String {
  val result = StringBuilder(prefix)

  for ((index, element) in this.withIndex()) {
    if (index > 0) result.append(separator)
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}

fun Collection<String>.join(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = "",
) = joinToString(separator, prefix, postfix)


fun mapInfix() {
  val map = mapOf(1 to "one", 2 to "two") // infix call. Instead of 1.to("one")
  val (number, name) = 1 to "one"
}