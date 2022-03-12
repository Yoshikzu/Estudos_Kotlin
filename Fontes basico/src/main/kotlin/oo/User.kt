package oo

class User(var name: String, var lastName: String, var password: String) {
    val fullname
        get() = "$name $lastName"

}

