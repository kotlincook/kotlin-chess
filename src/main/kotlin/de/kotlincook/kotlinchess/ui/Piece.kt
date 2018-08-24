package de.kotlincook.chess.ui

import com.vaadin.flow.component.html.Image
import de.kotlincook.kotlinchess.ui.Board
import de.kotlincook.kotlinchess.ui.Locatable


class Piece(src: String, alt: String) : Image(src, alt), Locatable {

    override val board: Board
        get() = (parent.get() as Piece).board

    init {
        className = "piece"
        setId(alt)
    }

}