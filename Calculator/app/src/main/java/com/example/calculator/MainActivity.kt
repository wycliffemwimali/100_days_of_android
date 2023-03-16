package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnarea = findViewById (R.id.btnCircle) as Button
        val btnareaRect = findViewById (R.id.btnRectangle) as Button
        val btnvolumeSphere = findViewById(R.id.btnSphere) as Button
        val btnareaTriangle = findViewById(R.id.btnTriangle) as Button
        val btnAbout = findViewById(R.id.btnAbout) as Button

        btnarea.setOnClickListener{
            val intent = Intent(this, AreaCircle::class.java)
            startActivity(intent)
        }

        btnareaRect.setOnClickListener{
            val intent = Intent(this, AreaRectangle::class.java)
            startActivity(intent)
        }
        btnvolumeSphere.setOnClickListener{
            val intent = Intent(this, VolumeSphere::class.java)
            startActivity(intent)
        }
        btnareaTriangle.setOnClickListener{
            val intent = Intent(this, AreaTriangle::class.java)
            startActivity(intent)
        }
        btnAbout.setOnClickListener{
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}