package com.cursoappkotlin.agenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById(R.id.set_event) as Button

        btnSetEvent.setOnClickListener{
            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE,"Bootcamp everis")
                .putExtra(EVENT_LOCATION,"online")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,System.currentTimeMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME,System.currentTimeMillis() + (60*60*1000))

            startActivity(intent)
            /*(60*60*1000) => 60 seg x 60 min x 1000 => mais 1 hora */

        }
    }
}
