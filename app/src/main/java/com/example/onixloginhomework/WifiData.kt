package com.example.onixloginhomework

import android.net.wifi.ScanResult

data class WifiData(
    val scanResult: ScanResult,
    val short: String,
    val radius: Int,
    val angle: Float

)