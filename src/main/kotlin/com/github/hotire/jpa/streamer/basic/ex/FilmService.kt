package com.github.hotire.jpa.streamer.basic.ex

import com.speedment.jpastreamer.application.JPAStreamer
import org.springframework.stereotype.Service
import java.util.stream.Collectors.toList
import java.util.stream.Stream

@Service
class FilmService(
    private val fileRepository: FilmRepository,
    private val jpaStreamer: JPAStreamer
) {

    private val filStreamer: Stream<Film>
        get() = jpaStreamer.stream(Film::class.java)

    fun save(film: Film) = fileRepository.save(film)

    fun findAll() = filStreamer.collect(toList())

    fun findByTitle(title: String) = filStreamer
        .filter(`Film$`.title.equal(title))
        .sorted(`Film$`.title.reversed())
        .collect(toList())
}
