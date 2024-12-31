package ch03

class Ch03User(
    val id: String,
    var name: String,
) {

}

fun Ch03User.validateByName() {

    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("userId: $id, $fieldName is empty")
        }
    }
    validate(name, "name")
}