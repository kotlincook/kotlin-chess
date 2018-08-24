package de.kotlincook.kotlinchess.ui

import com.vaadin.flow.component.page.Page
import com.vaadin.flow.dom.Element

fun Page.addDragSupport(element: Element) {
    element.setAttribute("style", "cursor:move")
}

fun Page.addDropSupport(element: Element) {
    executeJavaScript("""
            function handleDrop(e) {
              e.preventDefault();
            }
            function handleDragover(e) {
               e.preventDefault();
            }
            $0.addEventListener('dragover', handleDragover, false);
            $0.addEventListener('drop', handleDrop, false);
            """, element)
}