package com.example.onixloginhomework.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.onixloginhomework.singleLiveEvent.SingleLiveEvent


class SettingsViewModel : ViewModel() {
    private val _navigate = SingleLiveEvent<NavDirections>()
    val navigate: LiveData<NavDirections> = _navigate
    val model: SettingsModel = SettingsModel()

    fun touchX() {
    model.checkChoice = true
    model.position = 1
    }

    fun touchO() {
    model.checkChoice = true
    model.position = 2
    }

    fun onNextClick() {
        if(model.checkChoice) {
                _navigate.value = SettingsFragmentDirections.actionSettingsFragmentToBoardFragment(model.position)
        }
    }
}