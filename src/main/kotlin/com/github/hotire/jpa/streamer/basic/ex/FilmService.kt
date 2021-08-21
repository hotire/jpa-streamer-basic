package com.github.hotire.jpa.streamer.basic.ex

import com.speedment.jpastreamer.application.JPAStreamer
import org.springframework.stereotype.Service
import java.util.stream.Collectors.toList
import java.util.stream.Stream
import javax.persistence.EntityManagerFactory

@Service
class FilmService(
    private val fileRepository: FilmRepository,
    private val entityManagerFactory: EntityManagerFactory
) {

    private val jpaStreamer: JPAStreamer by lazy {
        JPAStreamer.createJPAStreamerBuilder(entityManagerFactory)
            .build()
    }

    private val filStreamer: Stream<Film>
        get() = jpaStreamer.stream(Film::class.java)

    fun save(film: Film) = fileRepository.save(film)

    fun findAll() = filStreamer.collect(toList())
}
