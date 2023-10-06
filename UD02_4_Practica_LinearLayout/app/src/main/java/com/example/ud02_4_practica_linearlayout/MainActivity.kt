package com.example.ud02_4_practica_linearlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val callButton: Button = findViewById(R.id.buttonCall)
        val callName: TextView = findViewById(R.id.textName)
        val callingField : TextView = findViewById(R.id.messageCalling);

        callButton.setOnClickListener {
            callingField.text = buildString {
        append("LLamando a ")
        append(callName.text)
        }
        }

    }
}