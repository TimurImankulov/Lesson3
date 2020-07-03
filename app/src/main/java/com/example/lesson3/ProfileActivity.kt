package com.example.lesson3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = "Ilon"
        val lastName = "Mask"

        val textView1 = findViewById<TextView>(R.id.profileTextView1)
        val textView2 = findViewById<TextView>(R.id.profileTextView2)
        val textView3 = findViewById<TextView>(R.id.profileTextView3)

        val chData = intent.getBooleanExtra("bvFromLogActivity", false)


        if (chData){
            textView1.text = name
            textView2.text = lastName
            textView3.text = "Переход с LoginActivity"
        } else{
            val loginFromRegistrationActivity = intent.getStringExtra("ifFromRegistraton")
            textView1.text = loginFromRegistrationActivity

            val passwordFromRegistrationActivity = intent.getStringExtra("ifFromRegistraton1")
            textView2.text = passwordFromRegistrationActivity

            textView3.text = "Переход с RegistratonActivity"
        }
















    }
}

