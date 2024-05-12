package com.ougi.networkapi

import okhttp3.WebSocket
import okhttp3.WebSocketListener
import retrofit2.Retrofit

interface NetworkApi {

    val baseRetrofit: Retrofit

    val authorizedRetrofit: Retrofit

    fun createWebSocketConnection(
        url: String,
        listener: WebSocketListener
    ): WebSocket
}