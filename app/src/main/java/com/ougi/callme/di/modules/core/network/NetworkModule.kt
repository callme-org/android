package com.ougi.callme.di.modules.core.network

import com.ougi.networkapi.NetworkApi
import com.ougi.networkimpl.di.NetworkComponentProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object NetworkModule {

    @Provides
    @Singleton
    fun provideNetworkApi(): NetworkApi = NetworkComponentProvider.provide()

}