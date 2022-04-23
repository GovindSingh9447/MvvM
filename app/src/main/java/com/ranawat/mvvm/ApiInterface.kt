package com.ranawat.mvvm

import android.graphics.Movie
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("listUsers")
    suspend fun getNews() :Response<Movie>

    companion object{
        operator fun invoke(

        ):ApiInterface{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://mvvmapi.herokuapp.com/")
                .build()
                .create(ApiInterface::class.java)
        }


    }    }
