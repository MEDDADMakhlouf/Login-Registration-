package com.example.login_registration.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.login_registration.screens.SignUpScreen
import com.example.login_registration.ui.theme.LoginRegistrationTheme

@Composable
fun PostOfficeApp() {
    LoginRegistrationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White

        ) {
            SignUpScreen()

        }
    }
}