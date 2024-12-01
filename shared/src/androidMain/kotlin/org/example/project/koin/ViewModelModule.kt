package org.example.project.koin

import org.example.project.viewmodels.FakeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun getViewModelsModule(): Module = module {
    viewModel {
        FakeViewModel(get())
    }
}