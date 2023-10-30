package com.patri.aplicacionespmdmt2.BoardgamesApp

data class Game (val name:String, val category: GameCategory, var isSelected:Boolean = false)