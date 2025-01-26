package com.example.projekti2.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("path/to/your/api")
    fun getData(): Call<List<YourDataModel>>
}
