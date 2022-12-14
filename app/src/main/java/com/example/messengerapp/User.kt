package com.example.messengerapp

class User {
    var name: String? = null
    var email: String? = null
    var uid: String? = null

    // empty constructor needed for Firebase
    constructor(){}

    constructor(name: String?, email: String?, uid: String?) {
        this.name = name
        this.email = email
        this.uid = uid
    }
}