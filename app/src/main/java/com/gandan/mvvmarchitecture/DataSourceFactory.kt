package com.gandan.mvvmarchitecture

import androidx.paging.DataSource


class DataSourceFactory() : DataSource.Factory<Int, Item>() {

    override fun create(): DataSource<Int, Item> {

    }
}