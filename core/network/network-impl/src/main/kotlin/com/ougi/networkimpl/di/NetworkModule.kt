package com.ougi.networkimpl.di

import com.ougi.networkapi.NetworkApi
import com.ougi.networkimpl.NetworkImpl
import com.ougi.networkimpl.data.repository.NetworkInfoRepositoryImpl
import com.ougi.networkimpl.domain.provider.OkHttpClientProvider
import com.ougi.networkimpl.domain.provider.OkHttpClientProviderImpl
import com.ougi.networkimpl.domain.provider.RetrofitProvider
import com.ougi.networkimpl.domain.provider.RetrofitProviderImpl
import com.ougi.networkimpl.domain.repository.NetworkInfoRepository
import dagger.Binds
import dagger.Module

@Module
internal interface NetworkModule {

    @Binds
    fun bindNetworkInfoRepository(repos: NetworkInfoRepositoryImpl): NetworkInfoRepository

    @Binds
    fun bindOkHttpClientProvider(provider: OkHttpClientProviderImpl): OkHttpClientProvider

    @Binds
    fun bindRetrofitProvider(provider: RetrofitProviderImpl): RetrofitProvider

    @Binds
    fun bindNetworkApi(impl: NetworkImpl): NetworkApi
}