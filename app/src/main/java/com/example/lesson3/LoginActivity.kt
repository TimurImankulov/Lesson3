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

        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val registrationButton = findViewById<Button>(R.id.registrationButton)

        loginButton.setOnClickListener {
            val loginText = login.text.toString()
            val passwordText = password.text.toString()

            val intent = Intent(applicationContext, ProfileActivity::class.java)
            intent.putExtra("ifFromLogin", loginText)
            intent.putExtra("ifFromLogin1", passwordText)
            startActivity(intent)
        }

        registrationButton.setOnClickListener {
            val intent = Intent(applicationContext, RegistratonActivity::class.java)
            startActivity(intent)
        }

    }
}



