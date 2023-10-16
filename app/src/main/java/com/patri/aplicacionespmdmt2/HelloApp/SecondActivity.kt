package com.patri.aplicacionespmdmt2.HelloApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.patri.aplicacionespmdmt2.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var textoHola = findViewById<TextView>(R.id.helloText)

    }



}