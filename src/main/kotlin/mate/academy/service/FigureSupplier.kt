package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val MIN_LENGTH = 1
private const val MAX_LENGTH = 10

class FigureSupplier(val colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        fun getRandomCircle(): Circle {
            return Circle(getRandomLength(), colorSupplier.getRandomColor())
        }

        fun getRandomSquare(): Square {
            return Square(getRandomLength(), colorSupplier.getRandomColor())
        }

        fun getRandomRectangle(): Rectangle {
            return Rectangle(getRandomLength(), getRandomLength(), colorSupplier.getRandomColor())
        }

        fun getRandomRightTriangle(): RightTriangle {
            return RightTriangle(getRandomLength(), getRandomLength(), colorSupplier.getRandomColor())
        }

        fun getRandomIsoscelesTrapezoid(): IsoscelesTrapezoid {
            return IsoscelesTrapezoid(
                getRandomLength(),
                getRandomLength(),
                getRandomLength(),
                colorSupplier.getRandomColor()
            )
        }

        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> getRandomCircle()
            FigureType.SQUARE -> getRandomSquare()
            FigureType.RECTANGLE -> getRandomRectangle()
            FigureType.RIGHT_TRIANGLE -> getRandomRightTriangle()
            FigureType.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
        }
    }

    fun getDefaultFigure(): Figure = Circle(MAX_LENGTH, Color.WHITE)

    private fun getRandomLength() = Random.nextInt(MIN_LENGTH, MAX_LENGTH)
}
