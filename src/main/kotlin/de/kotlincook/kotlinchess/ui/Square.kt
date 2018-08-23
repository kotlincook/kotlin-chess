package de.kotlincook.chess.ui

import com.vaadin.flow.component.html.Div
import de.kotlincook.kotlinchess.ChessCoord
import de.kotlincook.kotlinchess.Color

class Square(val coord: ChessCoord) : Div() {

    init {
        setId("square_$coord")
        className = when (coord.color()) {
            Color.BLACK -> "square black"
            Color.WHITE -> "square white"
        }
    }

}