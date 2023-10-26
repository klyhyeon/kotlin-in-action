package ch06

fun main() {
    val email: String? = getEmail()
    email?.let { sendMailTo(it) }
}

fun sendMailTo(email: String) {
    email.isNullOrBlank()
    email.isNullOrBlank()
    println("mail sent")
}

fun getEmail(): String? {
    return null
}