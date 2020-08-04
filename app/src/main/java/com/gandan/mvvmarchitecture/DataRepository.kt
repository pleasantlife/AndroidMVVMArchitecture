package com.gandan.mvvmarchitecture

import androidx.lifecycle.LiveData

class DataRepository(private val apiService: APIService) {

    fun getResult() : LiveData<List<Item>> {
        
    }
}