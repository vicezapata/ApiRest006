package com.example.apirest006

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apirest006.ui.screens.PostScreen
import com.example.apirest006.ui.theme.ApiRestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Permite que la app dibuje contenido debajo de las barras del sistema
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Aquí inicia Jetpack Compose
        setContent {
            ApiRestTheme {
                val postViewModel: com.example.apirest006.viewmodel.PostViewModel = viewModel()
                PostScreen(viewModel = postViewModel)
            }
        }
    }
}
