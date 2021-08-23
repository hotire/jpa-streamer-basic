package com.github.hotire.jpa.streamer.basic.ex

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class FilmServiceTest(private val filmService: FilmService) {

    @Test
    fun findAll() {
        // no assert
        filmService.findAll()
    }
}
