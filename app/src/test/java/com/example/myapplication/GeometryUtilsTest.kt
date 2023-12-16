package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class GeometryUtilsTest {
//
    @Test
    fun testSumOfAreas() {
        val circle = Circle("Red", 5.0)
        val rectangle = Rectangle("Blue", 4.0, 6.0)
        val triangle = Triangle("Green", 3.0, 4.0, 5.0)

        val shapes = listOf(circle, rectangle, triangle)

        assertEquals(108.54, GeometryUtils.sumOfAreas(shapes), 0.01)
    }
}
