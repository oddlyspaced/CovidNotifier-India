package com.oddlyspaced.covidnotifier

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener {
            val intent = Intent(this, CovidNotificationService::class.java)
            intent.action = CovidNotificationService().actionStartForegroundService
            startService(intent)
        }

        stop.setOnClickListener {
            val intent = Intent(this, CovidNotificationService::class.java)
            intent.action = CovidNotificationService().actionStopForegroundService
            startService(intent)
        }

    }

}