package com.github.hotire.jpa.streamer.basic

import com.speedment.jpastreamer.application.JPAStreamer

inline fun <reified T> JPAStreamer.stream() = this.stream(T::class.java)

open class JpaStreamerRepositorySupport<T>(private val jpaStreamer: JPAStreamer)
