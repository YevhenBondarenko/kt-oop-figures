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

        return when(getRandomFigureType()) {
            FigureType.CIRCLE -> getRandomCircle()
            FigureType.SQUARE -> getRandomSquare()
            FigureType.RECTANGLE -> getRandomRectangle()
            FigureType.RIGHT_TRIANGLE -> getRandomRightTriangle()
            FigureType.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
        }
    }

    fun getDefaultFigure() : Figure = Circle(10, Color.WHITE)

    private fun getRandomInt() = Random.nextInt(1, 5)
}
