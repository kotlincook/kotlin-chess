package de.kotlincook.kotlinchess

import de.kotlincook.kotlinchess.Color.*


enum class Color {
    BLACK, WHITE
}

enum class HorCoord {
    A, B, C, D, E, F, G, H;
    companion object {
        fun iterator() = values().asIterable()
    }
}

enum class VertCoord {
    _1, _2, _3, _4, _5, _6, _7, _8;
    companion object {
        fun iterator() = values().asIterable()
    }
}

data class ChessCoord(val hor: HorCoord, val vert: VertCoord) {
    companion object {
        fun iterator(): Iterable<ChessCoord> {
            return VertCoord.iterator().reversed().flatMap {
                vert -> HorCoord.iterator().map { hor -> ChessCoord(hor, vert) }
            }
        }
    }

    fun color() = if ((vert.ordinal + hor.ordinal).isEven()) BLACK else WHITE

    override fun toString() = "$hor$vert"
}

data class ChessMove(val from: ChessCoord, val to: ChessCoord)
