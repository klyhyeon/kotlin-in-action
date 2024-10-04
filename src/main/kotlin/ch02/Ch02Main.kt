package ch02

import ch02.createRandomRectangle

fun main() {
  println(Color.RED.rgb())

  println(max(1, 2))

  //다른 패키지 함수 import 하기
  createRandomRectangle().isSquare

  val list = arrayListOf("10", "11", "1001")
  for ((index, value) in list.withIndex()) {
    println("$index: $value")
  }

  // val 할당하기
  val str: String
  if (list.isNullOrEmpty()) {
    str = "is empty"
  } else {
    str = "not empty"
  }

  println(str)

  val person = Person(
    name = "유현",
    false,
  )
  println("name: ${person.name}")
  println("is married: ${person.isMarried}")

  val notMarriedCouples = listOf(Person("yuhyeon", false), Person("jiwoo", false))

  val byLastName = notMarriedCouples.associateBy { it.name }

  println(byLastName)
}

fun max(a: Int, b: Int) = if (a > b) a else b

interface Expr

class Sum(
  val right: Int,
  val left: Int
) : Expr

class Num(
  val value: Int
) : Expr

fun eval(e: Expr): Int =
  when (e) {
    is Num -> e.value
    is Sum -> e.right
    else -> throw IllegalArgumentException("Unknown expressions!")
  }

