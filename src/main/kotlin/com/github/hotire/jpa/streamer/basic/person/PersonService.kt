package com.github.hotire.jpa.streamer.basic.person

import com.github.hotire.jpa.streamer.basic.core.field.longField
import com.speedment.jpastreamer.application.JPAStreamer
import java.util.stream.Collectors
import org.springframework.stereotype.Service

@Service
class PersonService(private val jpaStreamer: JPAStreamer) {

    fun findAllByIdIn(ids: List<Long>) {
        jpaStreamer.stream(Person::class.java)
            .filter(Person::id.longField(true).`in`(ids))
//            .filter(`Person$`.id.`in`(ids))
            .collect(Collectors.toList())
    }
}
