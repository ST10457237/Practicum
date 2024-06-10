package com.example.exampracticium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnExit = findViewById<Button>(R.id.btnExit)

        //Set an OnClickListener fo the Next button to Navigate to MainScreen
        btnNext.setOnClickListener {
            val intent = Intent (this, MainScreen::class.java)
            startActivity(intent)
            }
        //set an OnClickListener for the Exit button to close the activity
        btnExit.setOnClickListener {
            finish()
        }

    }
}