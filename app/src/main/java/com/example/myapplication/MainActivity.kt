package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.PI
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circle = Circle("Red", 5.0)
        val rectangle = Rectangle("Blue", 4.0, 6.0)
        val triangle = Triangle("Green", 3.0, 4.0, 5.0)

        val figures = arrayOf(circle, rectangle, triangle)

        val resultTextView: TextView = findViewById(R.id.resultTextView)

        val figureProcessor = FigureProcessor(figures)
        val resultString = figureProcessor.processFigures()

        resultTextView.text = resultString
    }
}
// Интерфейс для геометрических фигур
interface Figure {
    val color: String
    fun area(): Double
    fun perimeter(): Double
}

// Реализация класса круга
data class Circle(override val color: String, val radius: Double) : Figure {
    override fun area(): Double = PI * radius * radius
    override fun perimeter(): Double = 2 * PI * radius
}

// Реализация класса прямоугольника
data class Rectangle(override val color: String, val width: Double, val height: Double) : Figure {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}

// Реализация класса треугольника
data class Triangle(override val color: String, val side1: Double, val side2: Double, val side3: Double) : Figure {
    override fun area(): Double {
        val s = perimeter() / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    override fun perimeter(): Double = side1 + side2 + side3
}

// Класс для работы с геометрическими фигурами
class FigureProcessor(private val figures: Array<Figure>) {
    fun processFigures(): String {
        val resultString = StringBuilder()

        for (figure in figures) {
            resultString.append("Figure: ${figure.javaClass.simpleName}\n")
            resultString.append("Color: ${figure.color}\n")
            resultString.append("Area: ${figure.area()}\n")
            resultString.append("Perimeter: ${figure.perimeter()}\n\n")
        }

        resultString.append("Sum of Areas: ${sumOfAreas(figures)}")

        return resultString.toString()
    }

    private fun sumOfAreas(figures: Array<Figure>): Double {
        return figures.sumByDouble { it.area() }
    }
}