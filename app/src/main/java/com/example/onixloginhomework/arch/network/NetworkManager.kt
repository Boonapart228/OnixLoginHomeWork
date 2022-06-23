package com.example.onixloginhomework.arch.network

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.ScanResult
import android.net.wifi.WifiManager
import android.util.Log
import com.example.onixloginhomework.WifiData
import kotlin.math.abs

class NetworkManager(context: Context) {

         val wifiManager: WifiManager =
        context.getSystemService(Context.WIFI_SERVICE) as WifiManager

    private val list: ArrayList<WifiData> = arrayListOf()
    private val MAX_LIST_SIZE = 16
    private val wifiReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val wifiScanList: List<ScanResult> = wifiManager.scanResults
            updateList(wifiScanList)
            Log.d("Bob", "${wifiScanList.size}")
        }
    }
    init {
        wifiManager.startScan()
        context.registerReceiver(
            wifiReceiver,
            IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)
        )

    }



    fun updateList(list: List<ScanResult>) {
        val tempList = arrayListOf<WifiData>()

        if (list.size <= MAX_LIST_SIZE) {
            list.forEach { it ->
                val index = list.indexOf(it)
                tempList.add(WifiData(it, it.SSID, abs(it.level), 360.0f / MAX_LIST_SIZE * index))
                Log.d("dsds", "${it.SSID}")
            }
        } else {
            for (i in 0..MAX_LIST_SIZE) {
                tempList.add(
                    WifiData(
                        list[i],
                        list[i].SSID,
                        abs(list[i].level),
                        360.0f / MAX_LIST_SIZE * i
                    )
                )
                Log.d("dsds", "${list[i].SSID}")
            }
        }

        this.list.clear()
        this.list.addAll(tempList)
    }
    fun getResultList(): ArrayList<WifiData> {
        return this.list
    }
}