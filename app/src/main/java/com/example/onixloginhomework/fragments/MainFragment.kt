package com.example.onixloginhomework.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val navArgs: MainFragmentArgs by navArgs()

    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.user.text = navArgs.loginhello

    }
}