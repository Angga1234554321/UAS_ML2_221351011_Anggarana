package com.example.uas_ml2_221351011_anggarana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class InputActivity : AppCompatActivity() {
    private lateinit var yearInput: EditText
    private lateinit var kmInput: EditText
    private lateinit var brandInput: EditText
    private lateinit var fuelInput: EditText
    private lateinit var transmissionInput: EditText
    private lateinit var predictButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        yearInput = findViewById(R.id.etYear)
        kmInput = findViewById(R.id.etKM)
        brandInput = findViewById(R.id.etBrand)
        fuelInput = findViewById(R.id.etFuel)
        transmissionInput = findViewById(R.id.etTransmission)
        predictButton = findViewById(R.id.btnPredict)

        val tfliteHelper = TFLiteHelper(this)

        predictButton.setOnClickListener {
            val year = yearInput.text.toString().toFloatOrNull() ?: 0f
            val km = kmInput.text.toString().toFloatOrNull() ?: 0f
            val brand = brandInput.text.toString().toFloatOrNull() ?: 0f
            val fuel = fuelInput.text.toString().toFloatOrNull() ?: 0f
            val transmission = transmissionInput.text.toString().toFloatOrNull() ?: 0f

            val inputArray = floatArrayOf(year, km, brand, fuel, transmission)
            val result = tfliteHelper.predictPrice(inputArray)

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("predicted_price", result)
            startActivity(intent)
        }
    }
}