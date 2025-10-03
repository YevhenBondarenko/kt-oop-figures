package mate.academy.model

class Circle(val radius: Int, color: Color) : AbstractFigure(color) {
    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: ${color.code}")
    }

    override fun calculateArea() = Math.PI * radius * radius
}
