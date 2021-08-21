package com.github.hotire.jpa.streamer.basic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaStreamerBasicApplication

fun main(args: Array<String>) {
    runApplication<JpaStreamerBasicApplication>(*args)
}
