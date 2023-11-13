package com.patri.aplicacionespmdmt2.ColorsApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.patri.aplicacionespmdmt2.R

class ColorsActivity : AppCompatActivity() {

    private lateinit var rvColorsH :RecyclerView
    private lateinit var rvAdapter: Adapter

    private val verticalBars = mutableListOf(
        VerticalBar(871890688,"V1 (20%)"),
        VerticalBar(1509921024,"V2, (35%)"),
        VerticalBar(-2131230976,"V3, (50%)"),
        VerticalBar(-1509883935,"V4, ()"),
        VerticalBar(-85871793,"V5, ()"),


    )
    private lateinit var rvColorsH: RecyclerView

    private fun initcomponents() {
        rvColorsH = findViewById<RecyclerView>(R.id.rvColorsH)
    }

    private fun initUI(){
        horizontalAdapter = HorizontalAdapter(verticalBars)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        rvEjemplo = findViewById(R.id.rvEjemplo)
        rvAdapter = EjemploAdapter(listaEjemplo)

        rvEjemplo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvEjemplo.adapter = rvAdapter

    }



}