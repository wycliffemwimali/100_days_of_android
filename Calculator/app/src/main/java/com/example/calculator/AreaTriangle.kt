package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AreaTriangle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_triangle)

        val base = findViewById(R.id.edtBase) as EditText
        val height = findViewById(R.id.edtHeight) as EditText
        val findArea = findViewById(R.id.btnArea) as Button
        val result = findViewById(R.id.txtAnswer) as TextView
        val clear = findViewById(R.id.btnClear) as Button

        findArea.setOnClickListener{
            val b = base.text.toString().toDouble()
            val h = height.text.toString().toDouble()
            val answer = 0.5 * b *  h
            result.text = answer.toString()
        }
        clear.setOnClickListener{
            base.setText("")
            height.setText("")
        }
    }
}