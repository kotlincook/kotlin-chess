package de.kotlincook.kotlinchess.ui

import com.vaadin.flow.component.dependency.StyleSheet
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.router.Route
import de.kotlincook.chess.ui.Piece
import de.kotlincook.chess.ui.Square
import de.kotlincook.kotlinchess.ChessCoord
import de.kotlincook.kotlinchess.HorCoord
import de.kotlincook.kotlinchess.HorCoord.*
import de.kotlincook.kotlinchess.VertCoord
import de.kotlincook.kotlinchess.VertCoord.*

@Route("chess")
@StyleSheet("frontend://chess.css")
class Board() : Div() {

    private val squares = object {
        init {
            ChessCoord.iterator().forEach { add(Square(it)) }
        }

        operator fun get(hor: HorCoord, vert: VertCoord) = at(ChessCoord(hor, vert))

        fun at(coord: ChessCoord) =
                try {
                    val optSquare = children.filter { it is Square && it.coord == coord }.findAny()
                    optSquare.get() as Square
                } catch (e: Exception) {
                    throw IllegalStateException("There is no square at $coord.")
                }
    }

    init {
        squares[A,_1].piece = Piece("frontend/icons/rookWhite.png", "white_rook_A")
        setId("chess_board")
        className = "board"
    }

}