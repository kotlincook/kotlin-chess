package de.kotlincook.chess.ui

import com.vaadin.flow.component.ComponentEvent
import com.vaadin.flow.component.DomEvent
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.html.Image
import de.kotlincook.kotlinchess.ui.Board
import de.kotlincook.kotlinchess.ui.Locatable
import de.kotlincook.kotlinchess.ui.addDragSupport


@DomEvent("dragstart")
class DragstartEvent(source : Piece, fromClient : Boolean) : ComponentEvent<Piece>(source, fromClient)

class Piece(src: String, alt: String) : Image(src, alt), Locatable {

    override val board: Board
        get() = (parent.get() as Piece).board

    init {
        className = "piece"
        setId(alt)
        UI.getCurrent().page.addDragSupport(element)
        addListener(DragstartEvent::class.java) { e -> println(e.source) }
    }

}