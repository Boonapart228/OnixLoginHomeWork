package com.example.onixloginhomework.fragments.login


import android.os.Bundle
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentLoginBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment :
    BaseFragment<FragmentLoginBinding>(contentLayoutID = R.layout.fragment_login) {
    private val viewModel: LoginViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

    }
}