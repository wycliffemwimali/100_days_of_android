package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AreaCircle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_circle)

        val radius = findViewById(R.id.edtRadius) as EditText
        val findArea = findViewById(R.id.btnArea) as Button
        val result = findViewById(R.id.txtAnswer) as TextView
        val clear = findViewById(R.id.btnClear) as Button

        findArea.setOnClickListener{
          //  val PI = 3.14
            val r = radius.text.toString().toDouble()
            val answer = Math.PI * r * r
            result.text = answer.toString()
        }

        clear.setOnClickListener{
            radius.getText().clear()
        }
    }
}