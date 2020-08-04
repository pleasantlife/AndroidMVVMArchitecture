package com.gandan.mvvmarchitecture

import androidx.paging.PositionalDataSource

class ResultDataSource(private val apiService: APIService): PositionalDataSource<Item>() {
    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Item>) {
        val result = mutableListOf<Item>()
        callback.onResult(result)
    }

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Item>) {
        val result = mutableListOf<Item>()
        callback.onResult(result, 0, 100)
    }
}