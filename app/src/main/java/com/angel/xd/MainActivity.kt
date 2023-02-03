package com.angel.xd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.user)
        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            var angel: String = "Hola mundo"
            angel = "Hola a todos"
            loginButton.text = angel
            username.setText("Usuarito")
        }

        val imageButton: ImageView = findViewById(R.id.imagenl)
        imageButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Vamos a morir", Toast.LENGTH_SHORT).show()

        }


    }
}