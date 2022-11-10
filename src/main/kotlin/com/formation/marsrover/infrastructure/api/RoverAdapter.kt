package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.RoverQuery

class RoverAdapter private constructor(val roverQuery: RoverQuery) {
    fun getRover(): RoverView = RoverView.from(roverQuery.find())

}
