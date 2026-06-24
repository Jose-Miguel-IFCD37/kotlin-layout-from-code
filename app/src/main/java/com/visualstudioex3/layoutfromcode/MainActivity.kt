package com.visualstudioex3.layoutfromcode

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.fitsSystemWindows = true

        val texto = TextView(this)
        texto.text = "Ejemplo de Layout Programado"

        val boton = Button(this)
        boton.text = "Cambiar Texto"
        boton.setOnClickListener {
            texto.text = "Texto modificado"
        }

        layout.addView(texto)
        layout.addView(boton)

        setContentView(layout)
    }
}
