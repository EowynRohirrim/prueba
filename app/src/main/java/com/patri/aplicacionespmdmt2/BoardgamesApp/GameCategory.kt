package com.patri.aplicacionespmdmt2.BoardgamesApp

sealed class GameCategory(var isSelected:Boolean = true) {
    object Deckbuilding : GameCategory()
    object Euro : GameCategory()
    object LCG : GameCategory()
    object Cooperative : GameCategory()
    object Legacy : GameCategory()
}
