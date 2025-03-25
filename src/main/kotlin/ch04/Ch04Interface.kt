package ch04

interface Clickable {


    fun showOff() = println("I'm clickable!")
}


interface DynamicClickable {

    fun showOff() = println("I'm dynamic clickable!")
}

class ClickImpl : Clickable, DynamicClickable {


    override fun showOff() {
        // need explict override default method if conflict happens with same default methods
        super<Clickable>.showOff()
    }
}


fun main() {
    ClickImpl().showOff()
}