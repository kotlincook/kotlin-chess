package de.kotlincook.kotlinchess

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinChessApplication

fun main(args: Array<String>) {
    runApplication<KotlinChessApplication>(*args)
}
