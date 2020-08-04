package com.gandan.mvvmarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = RetrofitUtil().getClient()
        val dataRepository = DataRepository(apiService)
        val viewModel = createViewModel(dataRepository)

        viewModel.liveData.observe(this, Observer {
            Log.e("liveData", it[0].title)
        })

    }

    fun createViewModel(dataRepository: DataRepository) : MainViewModel {
        return ViewModelProvider(this, MainViewModelFactory(dataRepository)).get(MainViewModel::class.java)
    }
}