package com.example.flightticketapp.TicketDetail

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.flightticketapp.Domain.FlightModel
import com.example.flightticketapp.R
import com.example.flightticketapp.Splash.StatusTopBarColor

class TicketDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val flight = intent.getSerializableExtra("flight") as FlightModel

        setContent {
            StatusTopBarColor()

            TicketDetailScreen(
                flight = flight,
                onBackClick = {finish()},
                onDownloadTicketClick = {

                }
            )
        }
    }
}