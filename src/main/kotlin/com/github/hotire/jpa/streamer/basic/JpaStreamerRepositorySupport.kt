package com.github.hotire.jpa.streamer.basic

import com.speedment.jpastreamer.application.JPAStreamer

inline fun <reified T> JPAStreamer.stream() = this.stream(T::class.java)

interface JpaStreamerRepositorySupport<T> {
    val jpaStreamer: JPAStreamer

//    val entityType: Class<*>
//        get() = ResolvableType.forClass(JpaStreamerRepositorySupport::class.java, this::class.java).generics[0]
//            .resolve()
}
