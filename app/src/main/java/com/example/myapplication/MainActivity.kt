package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circle = Circle("Red", 5.0)
        val rectangle = Rectangle("Blue", 4.0, 6.0)
        val triangle = Triangle("Green", 3.0, 4.0, 5.0)

        val shapes = listOf(circle, rectangle, triangle)

        val totalAreas = GeometryUtils.sumOfAreas(shapes)

        val resultTextView: TextView = findViewById(R.id.resultTextView)
        resultTextView.text = "Total areas: $totalAreas"
    }
}
