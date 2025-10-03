package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val MIN_INT = 1

private const val MAX_INT = 4

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

        fun getRandomFigureType(): FigureType = FigureType.values()[Random.nextInt(FigureType.values().size)]

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
