package ch06

fun main() {
    val email: String? = getEmail()
    sendMailTo(email ?: "")
}

fun sendMailTo(email: String) {

}

fun getEmail(): String {
    return ""
}