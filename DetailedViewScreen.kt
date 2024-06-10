package com.example.exampracticium

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class detailed : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        val days = arrayOf("Monday,Tuesday,Wednesday,Thursday,Friday, Saturday,Sunday")
        val Min = arrayOf("12,15,10,10")
        val max = arrayOf("25,29,18,16")
        val weatherConditions = arrayOf("Raining,cold")

        var txtDetails:TextView= findViewById(R.id.txtDetailes)
        val txAverage: TextView= findViewById(R.id.txtAverage)
        val backButton: Button = findViewById(R.id.backButton)

        intent.getStringArrayExtra("day")
        intent.getStringArrayExtra("Min")
        intent.getStringArrayExtra("Max")
        intent.getStringArrayExtra("weatherConditions")
        val intent = intent(this, detailed::class.java).apply{ putExtraData("day,day")
            putExtraData("min,min")
            putExtraData("Max,max")
            putExtraData("weatherConditions")
        }
        startActivity(intent)
    }

    private fun putExtraData(extraData: String) {

    }

    private fun intent(detailed: detailed, java: Class<detailed>) {

    }
}