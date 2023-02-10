package com.angel.xd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MenuRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_registro)
        val editPassword: EditText = findViewById(R.id.password)
        val nomCompleto: EditText = findViewById(R.id.nombrecomp)
        val repPassword: EditText = findViewById(R.id.repetirpassword)
        val correoelec: EditText = findViewById(R.id.correoelec)


        val textViewInicio: TextView = findViewById(R.id.iniciocuenta)
        textViewInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        val button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.botonregistro)
        button.setOnClickListener {
            var text: String = editPassword.text.toString()
            var text1: String = repPassword.text.toString()
            var text2: String = nomCompleto.text.toString()
            var text3: String = correoelec.text.toString()

            Toast.makeText(this@MenuRegistro, text2 + text3 + text + text1, Toast.LENGTH_SHORT)
                .show()
        }


    }
}