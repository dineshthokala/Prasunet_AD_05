package com.scan.qrscanner.navigation

sealed class NavScreens(val route: String) {
    object ScannerPage : NavScreens("Scanner")
}