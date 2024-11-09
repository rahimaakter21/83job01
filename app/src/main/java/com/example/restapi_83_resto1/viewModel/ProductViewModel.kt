package com.example.nsda_job_01.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapi_83_resto1.Product
import com.example.restapi_83_resto1.apiInstance

import kotlinx.coroutines.launch

class ProductViewModel:ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products
    init {
        viewModelScope.launch {
             fetchProducts()
        }
    }

    private  suspend fun fetchProducts() {
       try {
           val response = apiInstance.apiService.getProducts()
           _products.postValue(response)
       }catch (e:Exception){
           e.printStackTrace()
       }
    }
}