package com.patri.aplicacionespmdmt2.ColorsApp

import androidx.recyclerview.widget.RecyclerView
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

}