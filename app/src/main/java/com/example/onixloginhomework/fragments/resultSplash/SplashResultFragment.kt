package com.example.onixloginhomework.fragments.resultSplash

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentSplashResultBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import com.example.onixloginhomework.fragments.questiontest.two.QuestionTwoTestFragmentArgs
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashResultFragment :
    BaseFragment<FragmentSplashResultBinding>(contentLayoutID = R.layout.fragment_splash_result) {
    val scoreOne: SplashResultFragmentArgs by navArgs()
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Result.text =
            "You score ${scoreOne.scoreOnes + scoreOne.scoreTwos + scoreOne.scoreThrees} /9"

    }
}