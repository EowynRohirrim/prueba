package com.patri.aplicacionespmdmt2.BoardgamesApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CategoriesAdapter(private val categories: List<GameCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game_category, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount(): Int {
    }
    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position])
        holder.itemView.setOnClickListener{ onItemSelected(position) }



    }
    private fun updateGames(){
        gamesAdapter.notifyDataSetChanged()
    }


    private fun onGameSelected(position:Int){
        games[position].isSelected = !games[position].isSelected
        updateGames()
    }

    private fun onCategorieSelected(position:Int){
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateGames()
    }

}
