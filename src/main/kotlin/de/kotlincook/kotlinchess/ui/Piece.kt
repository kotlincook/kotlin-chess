package de.kotlincook.chess.ui

import com.vaadin.flow.component.html.Image


class Piece(src: String, alt: String) : Image(src, alt) {

    init {
        className = "piece"
        setId(alt)
    }

}