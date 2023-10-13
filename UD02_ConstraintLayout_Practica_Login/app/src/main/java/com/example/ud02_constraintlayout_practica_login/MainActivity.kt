package com.example.ud02_constraintlayout_practica_login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.buttonLogin)

        loginButton.setOnClickListener {

            var username  : EditText = findViewById(R.id.textInputUsername)
            var password  : EditText = findViewById(R.id.textInputPassword)

            var credentialsOut : TextView = findViewById(R.id.textCredentials)

            credentialsOut.text =
                getString(R.string.user) + " " + username.text + " " + getString(R.string.password) + " " + password.text

        }

    }
}