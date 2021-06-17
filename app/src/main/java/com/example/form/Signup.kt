package com.example.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class Signup : AppCompatActivity() {

    lateinit var btnPreviousLbl:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        var spGender=findViewById<Spinner>(R.id.spGender)
        var btnPreviousLbl=findViewById<Button>(R.id.btnPreviousLbl)

        btnPreviousLbl.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
       val gender= arrayOf("Male","Female")
       val adapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item, gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=adapter

}
}