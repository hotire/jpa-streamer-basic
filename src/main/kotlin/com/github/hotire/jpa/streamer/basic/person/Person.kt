package com.github.hotire.jpa.streamer.basic.person

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Person(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1L,

    var name: String = "hello"
)
