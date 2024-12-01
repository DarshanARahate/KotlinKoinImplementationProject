package org.example.project.koin

import org.example.project.viewmodels.FakeViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModule = module {
    single { FakeViewModel(get()) }
}

actual fun getViewModelsModule(): Module = viewModelModule

object ProvideViewModel : KoinComponent {
    fun getFakeViewModel(): FakeViewModel = get()
}