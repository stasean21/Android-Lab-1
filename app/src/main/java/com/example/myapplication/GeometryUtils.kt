package com.example.myapplication


object GeometryUtils {
    fun sumOfAreas(shapes: List<Shape>): Double {
        var totalArea = 0.0
        for (shape in shapes) {
            totalArea += shape.area()
        }
        return totalArea
    }
}