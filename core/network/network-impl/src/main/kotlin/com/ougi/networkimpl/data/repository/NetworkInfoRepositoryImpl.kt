package com.ougi.networkimpl.data.repository

import com.ougi.networkimpl.domain.model.NetworkInfo
import com.ougi.networkimpl.domain.repository.NetworkInfoRepository
import javax.inject.Inject

internal class NetworkInfoRepositoryImpl @Inject constructor() : NetworkInfoRepository {

    override val networkInfo: NetworkInfo =
        NetworkInfo(
            baseUrl = BASE_URL
        )

    private companion object {
        private const val BASE_URL = "https://callmeapp.tech:80/"
    }
}