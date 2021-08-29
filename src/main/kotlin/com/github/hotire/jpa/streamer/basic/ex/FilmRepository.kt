package com.github.hotire.jpa.streamer.basic.ex

import com.speedment.jpastreamer.application.JPAStreamer
import org.springframework.data.jpa.repository.JpaRepository

interface FilmRepository : JpaRepository<Film, Long>

interface CustomizedFilmRepository

class CustomizedFilmRepositoryImpl(private val jpaStreamer: JPAStreamer) : CustomizedFilmRepository
