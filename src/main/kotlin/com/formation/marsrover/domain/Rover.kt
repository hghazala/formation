package com.formation.marsrover.domain

data class Rover(val position : Point) {
    fun position(): Point {
        return Point(0,0)
    }
}