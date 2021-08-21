package com.github.hotire.jpa.streamer.basic.ex

import com.speedment.jpastreamer.application.JPAStreamer
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import javax.persistence.EntityManagerFactory

@Component
class FilmApplicationRunner(
    val fileRepository: FilmRepository,
    val entityManagerFactory: EntityManagerFactory
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        fileRepository.saveAndFlush(Film().apply { title = "hello" })

        val jpaStreamer = JPAStreamer.createJPAStreamerBuilder(entityManagerFactory).build()
        jpaStreamer.stream(Film::class.java) // Film.class is the @Entity representing the film-table
            .forEach(System.out::println)
    }
}
