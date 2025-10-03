package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier(ColorSupplier())
    val figures = Array(4) { figureSupplier.getRandomFigure() }
    figures.forEach { figure -> figure.draw() }
}
