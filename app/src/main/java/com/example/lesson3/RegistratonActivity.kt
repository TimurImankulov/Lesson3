package com.example.lesson3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistratonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registraton)

        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)
        val singupButton = findViewById<Button>(R.id.singupButton)

        singupButton.setOnClickListener {
            val loginText = login.text.toString()
            val passwordText = password.text.toString()

            val intent = Intent(applicationContext, ProfileActivity::class.java)
            intent.putExtra("ifFromRegistraton", loginText)
            intent.putExtra("ifFromRegistraton1", passwordText)
            startActivity(intent)

        }
    }
}