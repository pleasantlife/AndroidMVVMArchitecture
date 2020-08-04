package com.gandan.mvvmarchitecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val dataRepository: DataRepository) : ViewModel() {

    val liveData: LiveData<List<Item>> by lazy {
        dataRepository.getResult()
    }


}