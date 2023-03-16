package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AreaRectangle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_rectangle)

        val length = findViewById(R.id.edtLength) as EditText
        val width = findViewById(R.id.edtWidth) as EditText
        val findarea = findViewById(R.id.btnArea) as Button
        val result = findViewById(R.id.txtAnswer) as TextView
        val clear = findViewById(R.id.btnClear) as Button

        findarea.setOnClickListener{
            val len = length.text.toString().toInt()
            val wid = width.text.toString().toInt()
            val answer = len * wid
            result.text = answer.toString()
        }
        clear.setOnClickListener{
            length.setText("")
            width.setText("")
        }
    }
}