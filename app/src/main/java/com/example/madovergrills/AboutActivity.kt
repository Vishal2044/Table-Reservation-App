package com.example.madovergrills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val button1 = findViewById<Button>(R.id.homeButton)
        button1.setOnClickListener {
            val intent1 = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent1) // Use startActivity to launch the new activity
        }
    }
}