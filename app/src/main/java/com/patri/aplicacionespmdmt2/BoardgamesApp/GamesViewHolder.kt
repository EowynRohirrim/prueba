package com.patri.aplicacionespmdmt2.BoardgamesApp

class GamesViewHolder {

    fun render(game: Game) {
        if (game.isSelected) {
            tvGame.paintFlags = tvGame.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            tvGame.paintFlags = tvGame.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        cbGame.isChecked = game.isSelected

        tvGame.text = game.name
    }
    }