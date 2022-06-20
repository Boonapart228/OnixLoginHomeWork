package com.example.onixloginhomework.fragments.search

import androidx.lifecycle.ViewModel

class SearchViewModel : ViewModel() {
    val model: SearchModel = SearchModel()
    fun addWifi(){
    model.add = +1
        if (model.add >= 16){
            model.add = 16
        }
    }

}