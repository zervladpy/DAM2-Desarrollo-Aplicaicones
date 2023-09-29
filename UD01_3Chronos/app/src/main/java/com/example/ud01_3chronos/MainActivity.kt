package com.example.ud01_3chronos

import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    private lateinit var chronometer: Chronometer
    private var running: Boolean = false
    private var offset: Long = 0L

    val RUNNING_KEY = "running"
    val OFFSET_KEY = "offset"
    val BASE_KEY = "base"

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean(RUNNING_KEY, running)
        outState.putLong(OFFSET_KEY, offset)
        outState.putLong(BASE_KEY, chronometer.base)
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        if (running) {
            offset = SystemClock.elapsedRealtime() - chronometer.base
            chronometer.stop()
        }
        super.onStop()
    }

    override fun onRestart() {
        if (running) {
            offset = SystemClock.elapsedRealtime() - chronometer.base
            chronometer.stop()
        }
        super.onRestart()
    }

    override fun onResume() {
        if (running) {
            offset = SystemClock.elapsedRealtime() - chronometer.base
            chronometer.stop()
        }
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chronometer = findViewById(R.id.chronometer)

        if (savedInstanceState != null) {
            offset = savedInstanceState.getLong(OFFSET_KEY)
            running = savedInstanceState.getBoolean(RUNNING_KEY)

            if (running) {
                chronometer.base = savedInstanceState.getLong(BASE_KEY)
                chronometer.start()
            } else {
                chronometer.base =
                    SystemClock.elapsedRealtime() - offset
            }

        }


        val btnStart = findViewById<Button>(R.id.btn_start)
        btnStart.setOnClickListener {
            if (!running) {
                chronometer.base = SystemClock.elapsedRealtime() - offset
                chronometer.start()
                running = true
            }
        }

        val btnStop = findViewById<Button>(R.id.btn_pause)
        btnStop.setOnClickListener {
            if (running) {
                offset = SystemClock.elapsedRealtime() - chronometer.base
                chronometer.stop()
                running = false
            }
        }

        val btnRestart = findViewById<Button>(R.id.btn_restart)
        btnRestart.setOnClickListener {
            offset = 0L
            chronometer.base = SystemClock.elapsedRealtime()
        }

    }
}