package com.example.restapi_83_resto1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object apiInstance {
    val retrofit = Retrofit.Builder()

        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(apiService::class.java)

}

