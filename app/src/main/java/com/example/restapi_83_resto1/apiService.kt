package com.example.restapi_83_resto1

import retrofit2.http.GET

interface apiService {
    @GET("products")
    suspend fun  getProducts(): List<Product>

}