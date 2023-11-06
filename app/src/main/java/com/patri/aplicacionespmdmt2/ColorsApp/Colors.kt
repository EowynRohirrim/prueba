package com.patri.aplicacionespmdmt2.ColorsApp

import androidx.recyclerview.widget.RecyclerView
import com.patri.aplicacionespmdmt2.R

class Colors {
    private lateinit var rvColorsH: RecyclerView

    private fun initcomponents() {
        rvColorsH = findViewById<RecyclerView>(R.id.rvColorsH)
    }


}