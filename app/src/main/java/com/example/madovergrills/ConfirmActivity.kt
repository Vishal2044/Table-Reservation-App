package com.example.madovergrills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val homeButton = findViewById<Button>(R.id.homeButton)
        homeButton.setOnClickListener {
            val intent1 = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent1)
        }

        val anotherButton = findViewById<Button>(R.id.cancelButton)
        anotherButton.setOnClickListener {
            val intent = Intent(this, CancleActivity::class.java)
            startActivity(intent)
        }

        val mapButton = findViewById<Button>(R.id.locationButton)
        mapButton.setOnClickListener {
            openMapLocation()
        }

        val whatsappButton = findViewById<Button>(R.id.callNowButton)
        whatsappButton.setOnClickListener {
            openWhatsApp("+919904972638")
        }
    }

    private fun openMapLocation() {
        val mapIntentUri = Uri.parse("https://maps.app.goo.gl/Hqb1mq9KKHNWxiz76")

        val mapIntent = Intent(Intent.ACTION_VIEW, mapIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")

        if (mapIntent.resolveActivity(packageManager) != null) {
            startActivity(mapIntent)
        } else {
            val browserIntent = Intent(Intent.ACTION_VIEW, mapIntentUri)
            startActivity(browserIntent)
        }
    }

    private fun openWhatsApp(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber")
        startActivity(intent)
    }
}
