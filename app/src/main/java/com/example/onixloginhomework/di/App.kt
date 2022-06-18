package com.example.onixloginhomework.di

import com.example.onixloginhomework.fragments.splash.SplashViewModel
import com.example.onixloginhomework.settings.SettingsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<SplashViewModel> { SplashViewModel() }
    viewModel<SettingsViewModel> { SettingsViewModel() }
}
