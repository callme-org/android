package com.ougi.networkimpl.domain.provider

import okhttp3.OkHttpClient
import javax.inject.Inject

internal interface OkHttpClientProvider {

    val baseOkHttpClient: OkHttpClient

    val authorizedOkHttpClient: OkHttpClient

    val webSocketOkHttpClient: OkHttpClient
}

internal class OkHttpClientProviderImpl @Inject constructor() : OkHttpClientProvider {

    override val baseOkHttpClient: OkHttpClient = OkHttpClient.Builder()
        .build()

    override val authorizedOkHttpClient: OkHttpClient = baseOkHttpClient.newBuilder()
        //TODO: authorization logic here
        .build()

    override val webSocketOkHttpClient: OkHttpClient = OkHttpClient.Builder()
        .build()

}