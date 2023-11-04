package com.example.madovergrills

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent // Import Intent class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.getbutton)
        button1.setOnClickListener {
            val intent1 = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent1) // Use startActivity to launch the new activity
        }
    }
}
