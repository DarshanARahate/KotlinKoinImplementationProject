package org.example.project.koin

import org.example.project.usecases.FakeUseCase
import org.koin.dsl.module

val sharedModule = module {
    factory { FakeUseCase() }
}