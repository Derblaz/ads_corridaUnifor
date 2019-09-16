package com.example.corridaunifor.data

import com.example.corridaunifor.UserService
import com.example.corridaunifor.data.model.LoggedInUser
import com.example.corridaunifor.data.model.User
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    lateinit var usuario: User

    fun login(username: String, password: String): Result<LoggedInUser> {

        try {
             //TODO: handle loggedInUser authentication
            for (item in UserService.users){
                if(item.name == username && item.password == password)
                    this.usuario = item
            }

            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(),this.usuario.name)
            return Result.Success(fakeUser)

        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

