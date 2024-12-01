package org.example.project

import org.example.project.koin.getViewModelsModule
import org.example.project.koin.sharedModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(sharedModule + getViewModelsModule())
    }
}