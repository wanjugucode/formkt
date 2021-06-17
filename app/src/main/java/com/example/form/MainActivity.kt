package com.example.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNext=findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent=Intent(baseContext,Signup::class.java)
            startActivity(intent)
        }

    }
}