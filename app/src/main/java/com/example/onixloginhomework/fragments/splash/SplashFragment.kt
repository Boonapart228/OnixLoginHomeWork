package com.example.onixloginhomework.fragments.splash

import android.os.Bundle
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentSplashBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment<FragmentSplashBinding>(contentLayoutID = R.layout.fragment_splash) {
    private val viewModel: SplashViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

    }
}