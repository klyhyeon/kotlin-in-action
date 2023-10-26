package ch02

class Person(
    val name: String,
    var isMarried: Boolean,
) {
    override fun toString() = "Person(name='$name', isMarried=$isMarried)"
}