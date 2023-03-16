package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class VolumeSphere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_sphere)

        val radius = findViewById(R.id.edtRadius) as EditText
        val findVolume = findViewById(R.id.btnArea) as Button
        val answer = findViewById(R.id.txtAnswer) as TextView
        val clear = findViewById(R.id.btnClear) as Button

        findVolume.setOnClickListener{
            val r = radius.text.toString().toDouble()
            val volume = 4/3 * Math.PI * r * r * r
            answer.text = volume.toString()
        }
        clear.setOnClickListener{
            radius.setText("")
        }
    }
}