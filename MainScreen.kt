package com.example.exampracticium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

@Suppress("UNUSED_VARIABLE")
class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)


        val txtday: = findViewById<EditText>(R.id.txtDay)
        val txtMin: = findViewById<EditText>(R.id.txtMin)
        val txtMax: = findViewById<EditText>(R.id.txtMax)
        val weatherConditions: = findViewById<EditText>(R.id.txtWeatherConditions)

        val days = arrayOf("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday")
        val min = arrayOf("12,15,10,10")
        val max = arrayOf("25,29,18,16")
        val weatherConditions = arrayOf("Rainning,Cold")
    }

        val weatherConditions = weatherConditions.sum()

    override fun <T : View?> findViewById(id: Int): T {
        return super.findViewById(weatherConditions)
        finish()

    }

    }
}