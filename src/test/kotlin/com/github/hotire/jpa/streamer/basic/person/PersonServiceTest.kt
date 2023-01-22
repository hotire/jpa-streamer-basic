package com.github.hotire.jpa.streamer.basic.person

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class PersonServiceTest(private val personService: PersonService) {

    @Test
    fun findAllByIdIn() {
        personService.findAllByIdIn(listOf(1, 2, 3))
    }
}