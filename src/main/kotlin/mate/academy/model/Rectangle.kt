package mate.academy.model

class Rectangle(val firstSide: Int, val secondSide: Int, color: Color) : AbstractFigure(color) {
    override fun calculateArea(): Double = (firstSide * secondSide).toDouble()

    override fun draw() {
        println(
            "Figure: rectangle, area: ${calculateArea()} sq. units, firstSide: $firstSide units, " +
                    "secondSide: $secondSide units, color: ${color.code}"
        )
    }
}
