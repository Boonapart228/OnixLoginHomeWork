package com.example.onixloginhomework.fragments.search

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentSearchBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.math.log

class SearchFragment :

    BaseFragment<FragmentSearchBinding>(contentLayoutID = R.layout.fragment_search) {
    val wifiManager by lazy { context?.getSystemService(Context.WIFI_SERVICE) as WifiManager }
    val success by lazy { wifiManager.startScan() }
    val intentFilter = IntentFilter()
    private val viewModel: SearchViewModel by viewModel()
    fun scanSuccess() {
        val results = wifiManager.scanResults
        results.forEachIndexed { index, scanResult -> Log.d("$index", "${scanResult.level}") }

    }

    fun scanFailure() {
        // handle failure: new scan did NOT succeed
        // consider using old scan results: these are the OLD results!
        val results = wifiManager.scanResults
        //results.forEachIndexed { index, scanResult -> Log.d("$index", "${scanResult.level}") }
        Log.d("Vlad", "${wifiManager}")
    }

    val wifiScanReceiver = object : BroadcastReceiver() {

        override fun onReceive(context: Context, intent: Intent) {
            val success = intent.getBooleanExtra(WifiManager.EXTRA_RESULTS_UPDATED, false)
            if (success) {
                scanSuccess()
            } else {
                scanFailure()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        super.onViewCreated(view, savedInstanceState)


    }


    override fun onResume() {
        super.onResume()





        intentFilter.addAction(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)
        context?.registerReceiver(wifiScanReceiver, intentFilter)


        if (!success) {
            // scan failure handling
            scanFailure()
        }


    }
}

