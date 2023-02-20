package com.angel.xd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        val recyclerView:RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        var list = listOf<Result>()

        RetrofitInstance.api.getMovies("28a0d9072466fb61d9c60ead94c48450").enqueue(object:
            Callback<Movie>{
            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                if (response.body()!=null){
                    list= response.body()!!.results
                    val adapter = MoviesAdapter(list)
                    recyclerView.adapter = adapter
                }

            }
            override fun onFailure(call: Call<Movie>, t: Throwable) {
                Log.d("TAG",t.message.toString()) }
            })





    }
}