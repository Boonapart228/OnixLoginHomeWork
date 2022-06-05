package com.example.onixloginhomework.fragments.result

import android.os.Bundle
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentResultBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class ResultFragment : BaseFragment<FragmentResultBinding>(contentLayoutID = R.layout.fragment_result) {
    private val viewModel: ResultViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
    }
}