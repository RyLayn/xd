package com.angel.xd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.email)
        val loginButton: AppCompatButton = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
        }

        val textViewRegistrar: TextView = findViewById<TextView>(R.id.registerButton)
        textViewRegistrar.setOnClickListener {
            val intent = Intent(this, MenuRegistro::class.java)
            startActivity(intent)
        }

        val imageButton: ImageView = findViewById(R.id.imagenl)
        imageButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Vamos a morir", Toast.LENGTH_SHORT).show()
        }

    }
}