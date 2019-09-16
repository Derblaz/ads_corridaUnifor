package com.example.corridaunifor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.corridaunifor.data.model.User
import com.google.android.material.textfield.TextInputEditText

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val name = findViewById<TextInputEditText>(R.id.editTextName)
        val password = findViewById<TextInputEditText>(R.id.editTextPassword)
        val save = findViewById<Button>(R.id.btnRegister)



        save.setOnClickListener {
            val user = User(name.text.toString(),password.text.toString())
            val newuser = UserService.save(user)
            println(UserService.users)
        }


    }

}
