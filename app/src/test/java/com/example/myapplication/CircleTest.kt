package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class CircleTest {

    @Test
    fun testCircleArea() {
        val circle = Circle("Red", 5.0)
        assertEquals(78.54, circle.area(), 0.01)
    }
  //
    @Test
    fun testCirclePerimeter() {
        val circle = Circle("Red", 5.0)
        assertEquals(31.42, circle.perimeter(), 0.01)
    }
}