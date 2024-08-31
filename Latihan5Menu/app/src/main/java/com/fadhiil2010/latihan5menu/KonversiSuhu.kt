package com.fadhiil2010.latihan5menu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KonversiSuhu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)


        val inputC = findViewById<EditText>(R.id.inputC)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val Fahr = findViewById<TextView>(R.id.Fahr)
        val Kelv = findViewById<TextView>(R.id.kelv)
        val Ream = findViewById<TextView>(R.id.Ream)

        btnHitung.setOnClickListener {
            val Celcius = inputC.text.toString().toDoubleOrNull()

            if (Celcius != null){
                val Fahreinheit = (9.0/5.0) * Celcius +32
                val Kelvin = Celcius + 273.15
                val Reamur = (4.0/5.0) * Celcius

                Fahr.text = "Fahreinheit : $Fahreinheit"
                Kelv.text = "Kelvin : $Kelvin"
                Ream.text = "Reumur : $Reamur"
            }else{
                Fahr.text="Inputan Salah"
                Kelv.text="Inputan Salah"
                Ream.text="Inputan Salah"
            }
        }

        val ActButton1 = findViewById<Button>(R.id.btnhome)
        ActButton1.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}