package mate.academy.model

import kotlin.math.abs
import kotlin.math.sqrt

class IsoscelesTrapezoid(val firstBase: Int, val secondBase: Int, val side: Int, color: Color) : AbstractFigure(color) {
    override fun calculateArea(): Double {
        val triangleSide: Double = abs(firstBase + secondBase) * HALF
        val height: Double = sqrt(side * side + triangleSide * triangleSide)
        return (firstBase + secondBase).toDouble() * height * HALF;
    }

    override fun draw() {
        println(
            "Figure: isoscelesTrapezoid, area: ${calculateArea()} sq. units, firstBase: $firstBase units, " +
                    "secondBase: $secondBase units, side: $side units, color: ${color.code}"
        )
    }
}
