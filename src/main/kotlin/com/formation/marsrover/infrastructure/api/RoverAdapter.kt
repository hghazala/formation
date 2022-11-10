package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.Direction
import com.formation.marsrover.domain.Position
import com.formation.marsrover.domain.Rover


class RoverAdapter {
    fun getRover(): RoverView = RoverView.from(Rover(Position(x = 0, y = 0), direction = Direction.N))

}
