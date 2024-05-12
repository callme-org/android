package com.ougi.networkimpl.di

import com.ougi.networkapi.NetworkApi
import dagger.Component

@Component(
    modules = [NetworkModule::class]
)
interface NetworkComponent {

    val networkApi: NetworkApi

}