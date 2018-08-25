package de.kotlincook.kotlinchess.ui

import com.vaadin.flow.component.Component
import de.kotlincook.kotlinchess.ChessCoord


interface Locatable {

    val board: Board
//        get() {
//            val optParent = (this as Component).parent.get()
//            return when (optParent) {
//                is Board -> optParent
//                is Locatable -> optParent.board
//                else -> throw IllegalStateException("Unexpected type ${optParent::class})")
//            }
//        }

    val coord: ChessCoord
        get() = ChessCoord.iterator().first {
            coord -> board.squareAt(coord) === this || board.pieceAt(coord) === this
        }
}
