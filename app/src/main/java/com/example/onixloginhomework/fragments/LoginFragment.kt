package com.example.onixloginhomework.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {
    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.accept.setOnClickListener {
            val password: String = binding.editText1.text.toString()
            val passwordRepeat: String = binding.editText2.text.toString()
            val login: String = binding.editText.text.toString()
            if (login.matches(".*[A-z].*".toRegex())) {
                if (password.length < 8) {
                    binding.Error.setText(R.string.password_length_error)
                } else if (!password.matches(".*[A-Z].*".toRegex())) {
                    binding.Error.setText(R.string.password_error)
                } else if (!password.matches(".*[a-z].*".toRegex())) {
                    binding.Error.setText(R.string.password_error)
                } else if (!password.matches(".*[0-9].*".toRegex())) {
                    binding.Error.setText(R.string.password_letter_error)
                } else if (passwordRepeat != password) {
                    binding.Error.setText(R.string.password_login_error_repeat)
                } else {
                    if (login.length < 15) {
                        findNavController().navigate(
                            LoginFragmentDirections.actionLoginFragmentToMainFragment(
                                loginhello = login
                            )
                        )
                    } else {
                        binding.Error.setText(R.string.password_login_error_large)
                    }
                }
            } else {
                binding.Error.setText(R.string.password_login_error_empty)
            }

        }
    }
}
