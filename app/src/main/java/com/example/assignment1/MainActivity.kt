package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val act_online_classes =findViewById<TextView>(R.id.act_online_classes)

        act_online_classes.setOnClickListener{
            //Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            //finsh()

        }




    }
}