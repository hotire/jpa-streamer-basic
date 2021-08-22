package com.github.hotire.jpa.streamer.basic

import com.speedment.jpastreamer.application.JPAStreamer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManagerFactory

@Configuration
class JpaStreamerConfig {

    @Bean
    fun jpaStreamer(entityManagerFactory: EntityManagerFactory): JPAStreamer = JPAStreamer.createJPAStreamerBuilder(entityManagerFactory).build()
}
