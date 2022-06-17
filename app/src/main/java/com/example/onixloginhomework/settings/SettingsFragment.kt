package com.example.onixloginhomework.settings

import android.os.Bundle
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.SettingsFragmentBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SettingsFragment :
    BaseFragment<SettingsFragmentBinding>(contentLayoutID = R.layout.settings_fragment) {
    private val viewModel: SettingsViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

    }
    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::navigate)
    }
}
