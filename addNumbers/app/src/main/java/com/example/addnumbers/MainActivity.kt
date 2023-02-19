package com.example.addnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumberEditText = findViewById(R.id.editTextNumber) as EditText
        val secondNumberEditText = findViewById(R.id.editTextNumber2) as EditText
        val addButton = findViewById(R.id.button) as Button
        val resultTextView = findViewById(R.id.textView2) as TextView

        addButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val result = firstNumber + secondNumber
            resultTextView.text = result.toString()
        }
    }
}