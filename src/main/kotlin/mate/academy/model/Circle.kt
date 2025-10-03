package mate.academy.model

class Circle(val radius: Int = 10, color: Color = Color.WHITE) : AbstractFigure(color) {
    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: ${color.code}")
    }

    override fun calculateArea() = Math.PI * radius * radius
}
