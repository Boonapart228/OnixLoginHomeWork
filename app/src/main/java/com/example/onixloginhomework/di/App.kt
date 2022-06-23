package com.example.onixloginhomework.di

import com.example.onixloginhomework.arch.network.NetworkManager
import com.example.onixloginhomework.fragments.search.SearchViewModel
import com.example.onixloginhomework.fragments.splash.SplashViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<SplashViewModel> { SplashViewModel() }
    viewModel<SearchViewModel> {SearchViewModel(networkManager = get())}
    single<NetworkManager> { NetworkManager(context = androidApplication()) }
}
