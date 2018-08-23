package de.kotlincook.chess.ui

import com.vaadin.flow.component.dependency.StyleSheet
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.router.Route

@Route("chess")
@StyleSheet("frontend://chess.css")
class Board(): Div() {

    init {
        setId("board")
        className = "board"
    }

}