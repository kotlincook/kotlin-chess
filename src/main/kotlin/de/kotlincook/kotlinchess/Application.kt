package de.kotlincook.kotlinchess

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class KotlinChessApplication

fun main(args: Array<String>) {
    runApplication<KotlinChessApplication>(*args)
}

