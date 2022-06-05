package com.example.onixloginhomework.fragments.resultSplash

import android.os.Bundle
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentSplashResultBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashResultFragment : BaseFragment<FragmentSplashResultBinding>(contentLayoutID = R.layout.fragment_splash) {
    private val viewModel: SplashResultViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

    }
}