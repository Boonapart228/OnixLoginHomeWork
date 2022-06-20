package com.example.onixloginhomework.di

import com.example.onixloginhomework.fragments.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<SplashViewModel> { SplashViewModel() }
}
