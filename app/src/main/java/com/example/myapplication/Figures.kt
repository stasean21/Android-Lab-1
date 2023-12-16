package com.example.myapplication
import kotlin.math.sqrt

abstract class Shape(val color: String) {
    abstract fun area(): Double
}

class Circle(color: String, val radius: Double) : Shape(color) {
    override fun area(): Double = Math.PI * radius * radius

    // Добавлен метод perimeter для круга
    fun perimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(color: String, val width: Double, val height: Double) : Shape(color) {
    override fun area(): Double = width * height

    // Добавлен метод perimeter для прямоугольника
    fun perimeter(): Double = 2 * (width + height)
}

class Triangle(color: String, val side1: Double, val side2: Double, val side3: Double) : Shape(color) {
    override fun area(): Double {
        val s = (side1 + side2 + side3) / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    // Добавлен метод perimeter для треугольника
    fun perimeter(): Double = side1 + side2 + side3
}
