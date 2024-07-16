package com.scan.qrscanner

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.scan.qrscanner.navigation.NavGraph
import com.scan.qrscanner.ui.theme.ScannerCodeTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ScannerApp() {
    ScannerCodeTheme {
        val navController = rememberNavController()
        val systemUiController = rememberSystemUiController()

        SideEffect {
            systemUiController.setSystemBarsColor(Color.Black, false)
        }

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            NavGraph(navController = navController)
        }
    }
}