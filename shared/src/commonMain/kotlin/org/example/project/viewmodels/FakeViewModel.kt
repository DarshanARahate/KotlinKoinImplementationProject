package org.example.project.viewmodels

import androidx.lifecycle.ViewModel
import org.example.project.usecases.FakeUseCase

class FakeViewModel(private val fakeUseCase: FakeUseCase) : ViewModel() {
    fun fetchMessage() = fakeUseCase.invoke()
}