package com.example.corridaunifor

import com.example.corridaunifor.data.model.User

object UserService {

    var users = mutableListOf<User>()

    fun save (user : User) {
        this.users.add(user)
        println(users)
    }
}