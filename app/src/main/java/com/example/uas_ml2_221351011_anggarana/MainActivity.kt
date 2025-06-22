package com.example.uas_ml2_221351011_anggarana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInput = findViewById<Button>(R.id.btnInput)
        val btnAbout = findViewById<Button>(R.id.btnAbout)
        val btnArchitecture = findViewById<Button>(R.id.btnArchitecture)

        btnInput.setOnClickListener {
            startActivity(Intent(this, InputActivity::class.java))
        }

        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        btnArchitecture.setOnClickListener {
            startActivity(Intent(this, ArchitectureActivity::class.java))
        }
    }
}