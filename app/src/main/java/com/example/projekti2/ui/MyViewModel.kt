package com.example.projekti2.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.yourapp.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel(application: Application) : AndroidViewModel(application) {

    private val _data = MutableLiveData<List<String>>()
    val data: LiveData<List<String>> get() = _data

    fun fetchData() {
        RetrofitClient.apiService.getData().enqueue(object : Callback<List<String>> {
            override fun onResponse(call: Call<List<String>>, response: Response<List<String>>) {
                if (response.isSuccessful) {
                    _data.value = response.body()
                }
            }

            override fun onFailure(call: Call<List<String>>, t: Throwable) {
                // Handle error
            }
        })
    }
}