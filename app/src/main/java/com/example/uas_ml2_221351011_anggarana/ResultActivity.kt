package com.example.uas_ml2_221351011_anggarana

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val price = intent.getFloatExtra("predicted_price", 0f)
        val resultText: TextView = findViewById(R.id.tvResult)
        resultText.text = "Prediksi Harga Mobil: Rp %.2f".format(price)
    }
}