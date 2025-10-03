package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

private const val MAX_NUMBER_OF_FIGURES = 6

fun main() {
    val figureSupplier = FigureSupplier(ColorSupplier())
    val figures = Array(MAX_NUMBER_OF_FIGURES) { i ->
        if (i < MAX_NUMBER_OF_FIGURES / 2)
            figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }
    figures.forEach { figure -> figure.draw() }
}
