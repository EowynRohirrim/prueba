package com.patri.aplicacionespmdmt2.ColorsApp

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.patri.aplicacionespmdmt2.R

/**
El adapter coge la lista, cuenta los objetos, coge el layout de los objetos y se los pasa al View Holder, como litas
por posiciones y
 on create view holder le pasa el layout, recibe una posición y la pinta con la función render
 y el otro le pasa la lista*/
class HorizontalAdapter (private val verticalBar:List<VerticalBar>):RecyclerView.Adapter<HorizontalViewHolder>{
    /**El adapter se dedica a gestionar una clase principal
     * por lo que se hace una variable
     * private val Barras:ListOf(
     *  y aquí dentro se le pasa una lista
     *
     *  se crean 5 objetos barra
     *  barra(azul,"")
     *
     * )
     * */

    override fun onCreateViewHolder(parent: VerticalBar, viewType: Int): HorizontalViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical_bar, parent, false)
        return HorizontalViewHolder(view)

    }
    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.pintarViews(ejemplos[position])

    }

    override fun getItemCount(): Int {
        return ejemplos.size
    }



}