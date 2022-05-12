package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnbmi:Button
    lateinit var btnsendmoney: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbmi = findViewById(R.id.btnbmi)
        btnbmi.setOnClickListener {
            val intent = Intent(this, CalculateBmiactivity::class.java)
            startActivity(intent)
        }
//        setContentView(R.layout.activity_main)
        btnsendmoney = findViewById(R.id.btnsendmoney)
        btnsendmoney.setOnClickListener {
            val intent = Intent(this, SendMoneyactivity::class.java)
            startActivity(intent)
        }
    }

    }