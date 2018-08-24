package de.kotlincook.chess.ui

import com.vaadin.flow.component.html.Div
import de.kotlincook.kotlinchess.ChessCoord
import de.kotlincook.kotlinchess.Color
import de.kotlincook.kotlinchess.ui.Board
import de.kotlincook.kotlinchess.ui.Locatable

class Square(override val coord: ChessCoord) : Div(), Locatable {

    var piece: Piece?
        set(value) {
            removeAll()
            if (value != null) add(value)
        }
        get() {
            val optPiece = children.findAny()
            return if (optPiece.isPresent) optPiece.get() as Piece else null
        }


    init {
        setId("square_$coord")
        className = when (coord.color()) {
            Color.BLACK -> "square black"
            Color.WHITE -> "square white"
        }
    }

    override val board: Board
        get() = TODO("not implemented")
}