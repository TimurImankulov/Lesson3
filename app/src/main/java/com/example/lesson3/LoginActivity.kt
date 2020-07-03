package com.example.lesson3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val registrationButton = findViewById<Button>(R.id.registrationButton)

        loginButton.setOnClickListener {
            val intent = Intent(applicationContext, ProfileActivity::class.java)
            intent.putExtra("bvFromLogActivity",true)
            startActivity(intent)
        }

        registrationButton.setOnClickListener {
            val intent = Intent(applicationContext, RegistratonActivity::class.java)
            startActivity(intent)
        }

    }
}



