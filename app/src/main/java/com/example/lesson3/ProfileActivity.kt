package com.example.lesson3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val loginFromLoginActivity = intent.getStringExtra("ifFromLogin")
        val textView1 = findViewById<TextView>(R.id.profileTextView1)
        textView1.text = loginFromLoginActivity

        val passwordFromFirstActivity = intent.getStringExtra("ifFromLogin1")
        val textView2 = findViewById<TextView>(R.id.profileTextView2)
        textView2.text = passwordFromFirstActivity

        val loginFromRegistrationActivity = intent.getStringExtra("ifFromRegistraton")
        val textView3 = findViewById<TextView>(R.id.profileTextView1)
        textView3.text = loginFromRegistrationActivity

        val passwordFromRegistrationActivity = intent.getStringExtra("ifFromRegistraton1")
        val textView4 = findViewById<TextView>(R.id.profileTextView2)
        textView4.text = passwordFromRegistrationActivity



    }
}