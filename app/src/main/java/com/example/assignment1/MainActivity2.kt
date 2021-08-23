package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button_open=findViewById<Button>(R.id.button_open)
        button_open.setOnClickListener(View.OnClickListener{
            //  var dial= Uri.parse("tel:9010050613")
            // val intent=Intent(Intent.ACTION_VIEW,dial)

            // var fb= Uri.parse("https://www.facebook.com")
            //val intent=Intent(Intent.ACTION_VIEW,fb)
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)


        })
    }
}




