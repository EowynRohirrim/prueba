package com.patri.aplicacionespmdmt2.BoardgamesApp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.patri.aplicacionespmdmt2.R

class CategoriesViewHolder {
    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider: View = view.findViewById(R.id.divider)
    private val viewContainer: CardView = view.findViewById(R.id.viewContainer)

    fun render(gameCategory: GameCategory, onItemSelected: (Int) -> Unit){

        val color = if (gameCategory.isSelected) {
            R.color.bgapp_background_card
        } else {
            R.color.bgapp_background_disabled
        }

        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))


        itemView.setOnClickListener { onItemSelected(layoutPosition) }




        when(gameCategory){
            GameCategory.Cooperative -> {
                tvCategoryName.text = "Cooperativos"
                divider.setBackgroundColor(getColor(divider.context, R.color.bgapp



            }





    }

