package com.patri.aplicacionespmdmt2.ColorsApp

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patri.aplicacionespmdmt2.R

class ColorsActivity : AppCompatActivity {

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


}