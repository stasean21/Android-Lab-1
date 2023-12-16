package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class RectangleTest {

    @Test
    fun testRectangleArea() {
        val rectangle = Rectangle("Blue", 4.0, 6.0)
        assertEquals(24.0, rectangle.area(), 0.01)
    }

    @Test
    fun testRectanglePerimeter() {
        val rectangle = Rectangle("Blue", 4.0, 6.0)
        assertEquals(20.0, rectangle.perimeter(), 0.01)
    }
}
