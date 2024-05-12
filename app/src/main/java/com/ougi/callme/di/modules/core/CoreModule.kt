package com.ougi.callme.di.modules.core

import com.ougi.callme.di.modules.core.network.NetworkModule
import dagger.Module

@Module(
    includes = [
        NetworkModule::class
    ]
)
interface CoreModule