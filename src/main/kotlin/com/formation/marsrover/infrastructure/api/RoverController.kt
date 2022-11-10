package com.formation.marsrover.infrastructure.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RoverController {

    @GetMapping("/rover")
    fun getRover(): ResponseEntity<RoverView> {
        return ResponseEntity.ok(RoverView(0,0,"N"))
    }

}

data class RoverView(val x: Int, val y: Int, val direction: String)

