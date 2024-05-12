package com.ougi.networkimpl.domain.provider

import com.ougi.networkimpl.domain.repository.NetworkInfoRepository
import retrofit2.Retrofit
import javax.inject.Inject

internal interface RetrofitProvider {

    val baseRetrofit: Retrofit

    val authorizedRetrofit: Retrofit
}

internal class RetrofitProviderImpl @Inject constructor(
    networkInfoRepository: NetworkInfoRepository,
    okHttpClientProvider: OkHttpClientProvider
) : RetrofitProvider {

    override val baseRetrofit: Retrofit = Retrofit.Builder()
        .client(okHttpClientProvider.baseOkHttpClient)
        .baseUrl(networkInfoRepository.networkInfo.baseUrl)
        .build()

    override val authorizedRetrofit: Retrofit = baseRetrofit.newBuilder()
        .client(okHttpClientProvider.authorizedOkHttpClient)
        .build()

}