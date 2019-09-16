package com.example.corridaunifor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.corridaunifor.ui.login.LoginActivity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed


class SplashScreen : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash_screen)
//    }

    public override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_splash_screen);

        Handler().postDelayed(Runnable(){
            run(){
                val isUserLogged = false

                startActivity(Intent(this, if (isUserLogged) MainActivity::class.java else LoginActivity::class.java))
                finish()
            }
        }, 2000);
    }
}
