package com.example.vitaliowatch.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class QRViewModel : ViewModel() {
    private val _textInput = MutableStateFlow("")
    val textInput: StateFlow<String> = _textInput

    fun onTextChanged(newText: String) {
        _textInput.value = newText
    }
}