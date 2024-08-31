package com.fadhiil2010.latihan5menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ActButton = findViewById<Button>(R.id.btnSatu)
        ActButton.setOnClickListener {
            val Intent = Intent(this, KonversiSuhu::class.java)
            startActivity(Intent)
        }

        val ActButton2 = findViewById<Button>(R.id.btnDua)
        ActButton2.setOnClickListener {
            val Intent = Intent(this, ProgramKasir::class.java)
            startActivity(Intent)
        }
            //Id Button
        val ActButton3 = findViewById<Button>(R.id.btnTiga)
        ActButton3.setOnClickListener {
                                                    //Nama Page
            val Intent = Intent(this, PermukaanDanVolume::class.java)
            startActivity(Intent)
        }

        val ActButton4 = findViewById<Button>(R.id.btnEmpat)
        ActButton4.setOnClickListener {
            val Intent = Intent(this, ProgramPython::class.java)
            startActivity(Intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}