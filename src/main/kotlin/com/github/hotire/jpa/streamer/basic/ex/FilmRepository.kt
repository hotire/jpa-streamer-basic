package com.github.hotire.jpa.streamer.basic.ex

import org.springframework.data.jpa.repository.JpaRepository

interface FilmRepository : JpaRepository<Film, Long>
