package mate.academy.model

const val HALF = 0.5

abstract class AbstractFigure(val color: Color) : Figure {

    private val area: Double = calculateArea()

    override fun getArea() = area

    protected abstract fun calculateArea(): Double
}
