package com.ougi.networkimpl

import com.ougi.networkapi.NetworkApi
import com.ougi.networkimpl.domain.provider.OkHttpClientProvider
import com.ougi.networkimpl.domain.provider.RetrofitProvider
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import retrofit2.Retrofit
import javax.inject.Inject

internal class NetworkImpl @Inject constructor(
    private val retrofitProvider: RetrofitProvider,
    private val okHttpClientProvider: OkHttpClientProvider
) : NetworkApi {

    override val baseRetrofit: Retrofit
        get() = retrofitProvider.baseRetrofit
    override val authorizedRetrofit: Retrofit
        get() = retrofitProvider.authorizedRetrofit

    override fun createWebSocketConnection(url: String, listener: WebSocketListener): WebSocket =
        okHttpClientProvider.webSocketOkHttpClient
            .newWebSocket(
                Request.Builder()
                    .url(url)
                    .build(),
                listener
            )


}