package com.example.vitaliowatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.vitaliowatch.ui.screen.QRScreen
import com.example.vitaliowatch.ui.viewmodel.QRViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val qrViewModel: QRViewModel = viewModel()
            QRScreen(viewModel = qrViewModel)
        }
    }
}