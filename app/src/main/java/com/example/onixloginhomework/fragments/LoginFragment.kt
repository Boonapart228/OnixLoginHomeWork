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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onResume() {
        binding.accept.setOnClickListener {
            val password1: String = binding.editText1.text.toString()
            val password2: String = binding.editText2.text.toString()
            val login: String = binding.editText.text.toString()
            if (login.matches(".*[A-z].*".toRegex())) {
                if (password1.length < 8) {
                    binding.password.text = "Мінімальна довжина пароля 8 символів"
                } else if (!password1.matches(".*[A-Z].*".toRegex())) {
                    binding.password.text = "Пароль повинен містити 1 великий символ"
                } else if (!password1.matches(".*[a-z].*".toRegex())) {
                    binding.password.text = "Пароль повинен містити 1 маленький символ"
                } else if (!password1.matches(".*[0-9].*".toRegex())) {
                    binding.password.text = "Пароль повинен містити 1 цифру"
                } else if (password2 != password1) {
                    binding.password.text = "Паролі не співпадають"
                } else {
                    if (login.length < 15) {
                        findNavController().navigate(
                            LoginFragmentDirections.actionLoginFragmentToMainFragment(
                                loginhello = login
                            )
                        )
                    } else {
                        binding.password.text = "Логін завеликий"
                    }
                }
            } else {
                binding.password.text = "Логін повинен містити 1 великий або малий символ"
            }
        }


        super.onResume()
    }
}
