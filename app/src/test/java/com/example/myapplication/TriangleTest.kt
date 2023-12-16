package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class TriangleTest {

    @Test
    fun testTriangleArea() {
        val triangle = Triangle("Green", 3.0, 4.0, 5.0)
        assertEquals(6.0, triangle.area(), 0.01)
    }

    @Test
    fun testTrianglePerimeter() {
        val triangle = Triangle("Green", 3.0, 4.0, 5.0)
        assertEquals(12.0, triangle.perimeter(), 0.01)
    }
}
