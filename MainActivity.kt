package com.example.metodologia4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity()
private lateinit var btnlogin: Button
private lateinit var btnreg: Button {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnlogin = findViewById(R.id.Login)
        btnreg = findViewById(R.id.Registration)

        btnlogin.setOnClickListener{
            val intent = Intent (this, login::class.java)
            startActivity(Intent)

        }
    }



