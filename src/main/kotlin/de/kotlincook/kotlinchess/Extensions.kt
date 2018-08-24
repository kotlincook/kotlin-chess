package de.kotlincook.kotlinchess

import java.util.*

fun Int.isEven() = this % 2 == 0

fun <T> Optional<out Any>.getOrNull() = if (isPresent) this as T else null