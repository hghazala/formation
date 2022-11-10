package com.formation.marsrover.config

import com.formation.marsrover.infrastructure.api.RoverAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApiConfiguration {

    @Bean
     fun roverAdapter(): RoverAdapter {
         return RoverAdapter()
     }

}