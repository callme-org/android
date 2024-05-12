package com.ougi.callme.di

import com.ougi.callme.presentation.App
import dagger.Component

@Component(
    modules = []
)
interface AppComponent {

    fun inject(app: App)

}