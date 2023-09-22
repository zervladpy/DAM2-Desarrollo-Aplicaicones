package com.example.spinnerwine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSearch = findViewById<Button>(R.id.btn)

        btnSearch.setOnClickListener {
            val spinnerWines = findViewById<Spinner>(R.id.wineType)
            val selectedText = findViewById<TextView>(R.id.selectedWine)

            selectedText.text = getWines(spinnerWines.selectedItemId).joinToString("\n")
        }


    }

    fun getWines(id: Long): List<String> = when (id) {
            0L -> listOf("Albariño", "Moscato", "Verdejo")
            1L -> listOf("Rioja", "Ribera del Duero", "Toro")
            2L -> listOf("Cabarnet", "Franc", "Merlot")
            else -> listOf()

    }

}