package mate.academy.model

class RightTriangle(val firstLeg: Int, val secondLeg: Int, color: Color) : AbstractFigure(color) {
    override fun calculateArea(): Double = HALF * firstLeg * secondLeg

    override fun draw() {
        println(
            "Figure: rightTriangle, area: ${calculateArea()} sq. units, " +
                    "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: ${color.code}"
        )
    }
}
