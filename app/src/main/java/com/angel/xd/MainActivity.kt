package com.angel.xd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.user)
        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(this,MenuPrincipal::class.java)
            startActivity(intent)
        }

        val textViewRegistrar: TextView = findViewById<TextView>(R.id.registrar)
        textViewRegistrar.setOnClickListener {
            val intent = Intent(this, MenuRegistro::class.java)
            startActivity(intent)
        }

        val textViewInicio: TextView=findViewById(R.id.iniciocuenta)
        textViewInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val imageButton: ImageView = findViewById(R.id.imagenl)
        imageButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Vamos a morir", Toast.LENGTH_SHORT).show()
        }


    }
}