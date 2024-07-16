package com.scan.qrscanner.scanner

import androidx.camera.view.PreviewView
import com.scan.qrscanner.model.Scan

data class ScannerUiState(
    val previewView: PreviewView? = null,
    val scan: Scan? = null,
    val showBottomSheet: Boolean = false,
    val showCameraRequiredDialog: Boolean = false
)
