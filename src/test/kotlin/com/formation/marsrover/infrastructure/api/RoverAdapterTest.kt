package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.Direction
import com.formation.marsrover.domain.Position
import com.formation.marsrover.domain.Rover
import com.formation.marsrover.domain.RoverQuery
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.mock.mockito.MockBean

internal class RoverAdapterTest {

    @MockK
    private lateinit var roverQuery: RoverQuery

    @InjectMockKs
    private lateinit var roverAdapter: RoverAdapter

    @Test
    fun `should find a rover`() {
        val rover = Rover(Position(0,0),Direction.N)
        every {roverQuery.find()} returns rover

        val roverView = roverAdapter.getRover()

        assertThat (roverView).isEqualTo(rover)

    }
}