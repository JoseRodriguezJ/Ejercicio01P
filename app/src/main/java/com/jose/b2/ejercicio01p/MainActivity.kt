package com.jose.b2.ejercicio01p

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val openPostActivity =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult())
            { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    Toast.makeText(
                        applicationContext,
                        result.data?.getStringExtra("DATORETURN"),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        findViewById<TextView>(R.id.activity2_button).setOnClickListener(
            View.OnClickListener {
                openPostActivity.launch(
                    Intent(applicationContext, Activity2::class.java).apply
                    {
                        putExtra(
                            "DATOS",
                            "Este es el valor que se manda desde Main a la Actividad 2"
                        )
                    })
            })
        findViewById<TextView>(R.id.activity3_button).setOnClickListener(
            View.OnClickListener {
                openPostActivity.launch(
                    Intent(applicationContext, Activity3::class.java).apply
                    {
                        putExtra(
                            "DATOS",
                            "Este es el valor que se manda desde Main a la Actividad 3"
                        )
                    })
            })


    }
}