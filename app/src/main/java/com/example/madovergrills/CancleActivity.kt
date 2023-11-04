package com.example.madovergrills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CancleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancle)
        val button2 = findViewById<Button>(R.id.homeButton)
        button2.setOnClickListener {
            val intent1 = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent1)
        }
    }
}