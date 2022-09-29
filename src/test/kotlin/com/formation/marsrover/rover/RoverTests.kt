package com.formation.marsrover.rover

import com.formation.marsrover.domain.Point
import com.formation.marsrover.domain.Rover
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class RoverTests {


    @Test
    internal fun `should return rover start position`() {
        val rover: Rover = Rover(Point(0,0))
        val result = rover.position()
        assertThat(result).isEqualTo(Point(0, 0))
    }
}