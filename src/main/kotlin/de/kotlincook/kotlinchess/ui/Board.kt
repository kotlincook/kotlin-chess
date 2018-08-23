package de.kotlincook.kotlinchess.ui

import com.vaadin.flow.component.dependency.StyleSheet
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.router.Route
import de.kotlincook.chess.ui.Square
import de.kotlincook.kotlinchess.ChessCoord

@Route("chess")
@StyleSheet("frontend://chess.css")
class Board() : Div() {

    private val squares = object {
        init {
            ChessCoord.iterator().forEach { add(Square(it)) }
        }
    }

    init {
        setId("chess_board")
        className = "board"
    }

}