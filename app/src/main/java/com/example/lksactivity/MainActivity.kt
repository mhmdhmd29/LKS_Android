package com.example.lksactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnlogin = findViewById<Button>(R.id.btn_login)
        btnlogin.setOnClickListener {
            val intent = Intent(this,MenuItem::class.java)
            startActivity(intent)
        }
        val btn_register = findViewById<Button>(R.id.btn_register)
        btn_register.setOnClickListener {
            intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}