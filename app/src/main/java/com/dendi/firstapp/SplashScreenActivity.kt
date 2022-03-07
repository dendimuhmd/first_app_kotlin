package com.dendi.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var img : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        Handler().postDelayed({
        val intent = Intent( this@SplashScreenActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}