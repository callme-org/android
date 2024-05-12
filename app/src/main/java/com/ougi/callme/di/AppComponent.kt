package com.ougi.callme.di

import com.ougi.callme.di.modules.core.CoreModule
import com.ougi.callme.presentation.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class
    ]
)
interface AppComponent {

    fun inject(app: App)

}