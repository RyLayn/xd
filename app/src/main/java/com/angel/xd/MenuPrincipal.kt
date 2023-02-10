package com.angel.xd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val recyclerView:RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val list = listOf<String>("Avatar", "Pokemon", "El Gato con Botas", "Tarzan",
            "Interestelar", "Rocky", "Winnie Pooh", "Marvel", "Marvel", "Marvel", "Marvel")

        val adapter = MoviesAdapter(list)
        recyclerView.adapter = adapter
    }
}