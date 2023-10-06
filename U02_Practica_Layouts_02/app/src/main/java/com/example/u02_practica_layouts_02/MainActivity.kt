package com.example.u02_practica_layouts_02

import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageOurense: ImageView = findViewById(R.id.imageOurense)
        val iamgeSantiago: ImageView = findViewById(R.id.imageSantiago)

        imageOurense.setOnClickListener {
            val textOurense: TextView = findViewById(R.id.textOurense)
            textOurense.text = "La ciudad de ourense tiene puentes"
            val mp :MediaPlayer = MediaPlayer.create(this, R.raw.dragon_ball)
            mp.start()
        }

        iamgeSantiago.setOnClickListener {
            val textSantiago: TextView = findViewById(R.id.textSantiago)
            textSantiago.text = "La ciudad de santiago tiene una catedral"
            val mp :MediaPlayer = MediaPlayer.create(this, R.raw.blue_label)
            mp.start()
        }

    }
}