package com.ougi.callme.di.modules.core.network

import com.ougi.networkapi.NetworkApi
import com.ougi.networkimpl.di.NetworkComponentProvider
import dagger.Module
import dagger.Provides

@Module
object NetworkModule {

    @Provides
    fun provideNetworkApi(): NetworkApi = NetworkComponentProvider.provide()

}