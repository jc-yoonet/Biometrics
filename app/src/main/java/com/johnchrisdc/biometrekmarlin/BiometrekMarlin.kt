package com.johnchrisdc.biometrekmarlin

import android.app.Application

import timber.log.Timber

class BiometrekMarlin : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}