package de.kotlincook.chess.ui

import com.vaadin.flow.component.html.Image
import de.kotlincook.kotlinchess.ui.Board
import de.kotlincook.kotlinchess.ui.Locatable


class Piece(src: String, alt: String) : Image(src, alt), Locatable {

    override val board: Board
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    init {
        className = "piece"
        setId(alt)
    }

}