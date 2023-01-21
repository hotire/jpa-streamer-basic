package com.github.hotire.jpa.streamer.basic.person

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(private val personService: PersonService) {

    @GetMapping("/person")
    fun findAllByIdIn(@RequestParam ids: List<Long>) {
        return personService.findAllByIdIn(ids)
    }
}