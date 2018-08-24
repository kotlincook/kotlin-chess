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
        squares[B,_1].piece = Piece("frontend/icons/knightWhite1.png", "white_knight_B")
        squares[C,_1].piece = Piece("frontend/icons/bishopWhite.png", "white_bishop_C")
        squares[D,_1].piece = Piece("frontend/icons/queenWhite.png", "white_queen_D")
        squares[E,_1].piece = Piece("frontend/icons/kingWhite.png", "white_king_E")
        squares[F,_1].piece = Piece("frontend/icons/bishopWhite.png", "white_bishop_F")
        squares[G,_1].piece = Piece("frontend/icons/knightWhite2.png", "white_knight_G")
        squares[H,_1].piece = Piece("frontend/icons/rookWhite.png", "white_rook_H")
        for (horCoord in HorCoord.values()) {
            squares[horCoord,_2].piece = Piece("frontend/icons/pawnWhite.png", "white_pawn_" + horCoord)
        }
        squares[A,_8].piece = Piece("frontend/icons/rookBlack.png", "black_rook_A")
        squares[B,_8].piece = Piece("frontend/icons/knightBlack1.png", "black_knight_B")
        squares[C,_8].piece = Piece("frontend/icons/bishopBlack.png", "black_bishop_C")
        squares[D,_8].piece = Piece("frontend/icons/queenBlack.png", "black_queen_D")
        squares[E,_8].piece = Piece("frontend/icons/kingBlack.png", "black_king_E")
        squares[F,_8].piece = Piece("frontend/icons/bishopBlack.png", "black_bishop_F")
        squares[G,_8].piece = Piece("frontend/icons/knightBlack2.png", "black_knight_G")
        squares[H,_8].piece = Piece("frontend/icons/rookBlack.png", "black_rook_H")
        for (horCoord in HorCoord.values()) {
            squares[horCoord,_7].piece = Piece("frontend/icons/pawnBlack.png", "black_pawn_" + horCoord)
        }
        setId("chess_board")
        className = "board"
    }

    fun squareAt(coord: ChessCoord) = squares.at(coord)

    fun pieceAt(coord: ChessCoord) = squareAt(coord).piece

}