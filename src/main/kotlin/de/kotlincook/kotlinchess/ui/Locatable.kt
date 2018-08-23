package de.kotlincook.kotlinchess.ui

import de.kotlincook.kotlinchess.ChessCoord


interface Locatable {

    val board: Board
    val coord: ChessCoord
        get() = TODO()

}