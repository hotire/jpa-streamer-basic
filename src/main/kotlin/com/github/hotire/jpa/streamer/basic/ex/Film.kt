package com.github.hotire.jpa.streamer.basic.ex

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Film : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var filmId: Long? = null

    var title: String? = null

    var length: Int? = null

    var rating: String? = null

    override fun toString(): String {
        return "Film(filmId=$filmId, title=$title, length=$length, rating=$rating)"
    }
}
