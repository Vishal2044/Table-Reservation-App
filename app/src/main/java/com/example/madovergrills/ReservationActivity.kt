package com.example.madovergrills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class ReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)
        // Initialize the AutoCompleteTextViews and populate them with data
        val dateArrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, resources.getStringArray(R.array.date))
        val monthArrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, resources.getStringArray(R.array.month))
        val timeArrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, resources.getStringArray(R.array.time))

        val dateAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.date)
        val monthAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.month)
        val timeAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.time)

        dateAutoCompleteTextView.setAdapter(dateArrayAdapter)
        monthAutoCompleteTextView.setAdapter(monthArrayAdapter)
        timeAutoCompleteTextView.setAdapter(timeArrayAdapter)


        val button1 = findViewById<Button>(R.id.finalreservation)
        button1.setOnClickListener {
            val intent1 = Intent(this, ConfirmActivity::class.java)
            startActivity(intent1)
        }
    }
}