package com.jose.b2.ejercicio01p

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        val intento = intent
        Toast.makeText(
            applicationContext, intento.getStringExtra("DATOS"), Toast.LENGTH_SHORT
        ).show()


        findViewById<TextView>(R.id.textoActivity2).setOnClickListener(){
            val intentoResultado = Intent()
            intentoResultado.putExtra("DATORETURN", "Vengo de Actividad 2")
            setResult(Activity.RESULT_OK, intentoResultado)
            finish()
        }
    }
}