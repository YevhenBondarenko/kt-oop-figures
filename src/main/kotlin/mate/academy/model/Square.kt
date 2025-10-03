package mate.academy.model

class Square(val side: Int, color: Color): AbstractFigure(color) {
    override fun calculateArea(): Double = (side * side).toDouble()

    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: $side units, color: ${color.code}")
    }
}
