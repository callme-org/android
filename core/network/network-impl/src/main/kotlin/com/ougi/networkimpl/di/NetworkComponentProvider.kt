package com.ougi.networkimpl.di

import com.ougi.networkapi.NetworkApi

object NetworkComponentProvider {

    fun provide(): NetworkApi =
        DaggerNetworkComponent
            .create()
            .networkApi

}