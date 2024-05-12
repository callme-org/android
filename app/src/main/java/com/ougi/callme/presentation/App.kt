package com.ougi.callme.presentation

import android.app.Application
import com.ougi.callme.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
    }

    private fun initAppComponent() {
        DaggerAppComponent.create()
            .inject(this)
    }

}