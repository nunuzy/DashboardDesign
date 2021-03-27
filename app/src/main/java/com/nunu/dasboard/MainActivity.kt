package com.nunu.dasboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar!!.title = "Login Page"
        val myBtn = findViewById<Button>(R.id.myBtn)

        myBtn.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Login Successfully ", Toast.LENGTH_LONG).show();
        }

    }
}