package com.github.hotire.jpa.streamer.basic.ex

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/v1/films")
@RestController
class FilmController(private val fileService: FilmService) {

    @GetMapping("/save")
    fun save() = fileService.save(Film().apply { title = System.currentTimeMillis().toString() })

    @GetMapping
    fun findAll() = fileService.findAll()
}
