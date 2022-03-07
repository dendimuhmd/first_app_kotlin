package com.dendi.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edtUsername : EditText
    private lateinit var edtPass : EditText
    private lateinit var outUsername : TextView
    private lateinit var outPass : TextView
    private lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        edtUsername = findViewById(R.id.username)
        edtPass = findViewById(R.id.password)
        outUsername = findViewById(R.id.user_output)
        outPass = findViewById(R.id.password_output)
        btnLogin = findViewById(R.id.btn_lgn)

        btnLogin.setOnClickListener {
            outPass.text = edtPass.text.toString()
            outUsername.text = edtUsername.text.toString()
        }

    }
}