data class Coordinate(val x: Int, val y: Int) {
    val isInBounds = x >= 0 && y >= 0

    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y) // перегрузка оператора plus
}

enum class Direction (private val coordinate: Coordinate){
    NORTH(Coordinate(0, -1)), // стр 298 ???
    EAST(Coordinate(1, 0)),
    SOUTH(Coordinate(0, 1)),
    WEST(Coordinate(-1, 0));

    fun updateCoordinate(playerCoordinate: Coordinate) =    // функция изменяет положение игрока
//            Coordinate(playerCoordinate.x + coordinate.x,
//                    playerCoordinate.y + coordinate.y)
    coordinate + playerCoordinate
}
