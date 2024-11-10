package ch02

import ch02.createRandomRectangle

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
//  println(Color.RED.rgb())
//
//  println(max(1, 2))
//
//  //다른 패키지 함수 import 하기
//  createRandomRectangle().isSquare
//
//  val list = arrayListOf("10", "11", "1001")
//  for ((index, value) in list.withIndex()) {
//    println("$index: $value")
//  }
//
//  // val 할당하기
//  val str: String
//  if (list.isNullOrEmpty()) {
//    str = "is empty"
//  } else {
//    str = "not empty"
//  }
//
//  println(str)
//
//  val person = Person(
//    name = "유현",
//    false,
//  )
//  println("name: ${person.name}")
//  println("is married: ${person.isMarried}")
//
//  val notMarriedCouples = listOf(Person("yuhyeon", false), Person("jiwoo", false))
//
//  val byLastName = notMarriedCouples.associateBy { it.name }
//
//  println(byLastName)
}

fun max(a: Int, b: Int) = if (a > b) a else b

interface Expr

class Sum(
    val right: Expr,
    val left: Expr,
) : Expr

class Num(
    val value: Int
) : Expr

fun eval(e: Expr): Int {
    // java style code
//    if (e is Num) {
//        return e.value
//    }
//    if (e is Sum) {
//        return eval(e.right) + eval(e.left)
//    }
//    throw IllegalArgumentException("Unknown expression")
    when (e) {
        is Num -> return e.value
        is Sum -> return eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }
}

