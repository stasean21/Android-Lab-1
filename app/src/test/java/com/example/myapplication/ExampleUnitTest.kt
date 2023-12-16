package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class FigureTest {

    @Test
    fun testCircleArea() {
        val circle = Circle("Red", 3.0)
        assertEquals(28.27, circle.area(), 0.01)
    }

    @Test
    fun testRectangleArea() {
        val rectangle = Rectangle("Blue", 2.0, 4.0)
        assertEquals(8.0, rectangle.area(), 0.01)
    }

    @Test
    fun testTriangleArea() {
        val triangle = Triangle("Green", 5.0, 7.0, 8.0)
        assertEquals(17.32, triangle.area(), 0.01)
    }

    @Test
    fun testCirclePerimeter() {
        val circle = Circle("Red", 3.0)
        assertEquals(18.85, circle.perimeter(), 0.01)
    }

    @Test
    fun testRectanglePerimeter() {
        val rectangle = Rectangle("Blue", 2.0, 4.0)
        assertEquals(12.0, rectangle.perimeter(), 0.01)
    }

    @Test
    fun testTrianglePerimeter() {
        val triangle = Triangle("Green", 5.0, 7.0, 8.0)
        assertEquals(20.0, triangle.perimeter(), 0.01)
    }
}
