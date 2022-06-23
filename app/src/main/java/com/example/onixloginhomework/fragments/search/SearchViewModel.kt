package com.example.onixloginhomework.fragments.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.onixloginhomework.WifiData
import com.example.onixloginhomework.arch.network.NetworkManager
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SearchViewModel(networkManager: NetworkManager) : ViewModel() {
    val model: SearchModel = SearchModel()
    private val _result = MutableLiveData<ArrayList<WifiData>>()
    val result: LiveData<ArrayList<WifiData>> = _result

    init {
        viewModelScope.launch {
            while (true) {
                delay(1000)
                networkManager.wifiManager.startScan()
                _result.value = networkManager.getResultList()

            }
        }
    }
}