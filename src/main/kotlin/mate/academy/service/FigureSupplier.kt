package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

private const val MIN_INT = 1

private const val MAX_INT = 10

class FigureSupplier(val colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        fun getRandomCircle(): Circle {
            return Circle(getRandomInt(), colorSupplier.getRandomColor())
        }

        fun getRandomSquare(): Square {
            return Square(getRandomInt(), colorSupplier.getRandomColor())
        }

        fun getRandomRectangle(): Rectangle {
            return Rectangle(getRandomInt(), getRandomInt(), colorSupplier.getRandomColor())
        }

        fun getRandomRightTriangle(): RightTriangle {
            return RightTriangle(getRandomInt(), getRandomInt(), colorSupplier.getRandomColor())
        }

        fun getRandomIsoscelesTrapezoid(): IsoscelesTrapezoid {
            return IsoscelesTrapezoid(getRandomInt(), getRandomInt(), getRandomInt(), colorSupplier.getRandomColor())
        }

        fun getRandomFigureType(): FigureType = FigureType.values()[Random.nextInt(Color.values().size)]

        return when (getRandomFigureType()) {
            FigureType.CIRCLE -> getRandomCircle()
            FigureType.SQUARE -> getRandomSquare()
            FigureType.RECTANGLE -> getRandomRectangle()
            FigureType.RIGHT_TRIANGLE -> getRandomRightTriangle()
            FigureType.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
        }
    }

    fun getDefaultFigure(): Figure = Circle()

    private fun getRandomInt() = Random.nextInt(MIN_INT, MAX_INT)
}
