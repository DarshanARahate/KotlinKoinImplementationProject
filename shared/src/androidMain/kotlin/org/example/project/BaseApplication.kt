package org.example.project

import android.app.Application
import org.example.project.koin.getViewModelsModule
import org.example.project.koin.sharedModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(
                sharedModule + getViewModelsModule()
            )
        }
    }
}