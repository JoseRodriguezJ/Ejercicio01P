package com.jose.b2.ejercicio01p

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        Toast.makeText(
            applicationContext, "Este es el valor que se manda desde la actividad 3"
            , Toast.LENGTH_SHORT
        ).show()

        findViewById<TextView>(R.id.textoActivity3).setOnClickListener(){
            val intentoResultado = Intent()
            intentoResultado.putExtra("DATORETURN", "Vengo de la Actividad 3")
            setResult(Activity.RESULT_OK, intentoResultado)
            finish()
        }
    }
}