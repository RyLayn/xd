package com.angel.xd

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/popular")
    fun getMovies(@Query("api_key") api_key:String):Call<Movie>


}