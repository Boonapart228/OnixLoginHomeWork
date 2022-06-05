package com.example.onixloginhomework.fragments.question

import android.os.Bundle
import android.view.View
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentQuestionBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuestionFragment :
    BaseFragment<FragmentQuestionBinding>(contentLayoutID = R.layout.fragment_question) {
    private val viewModel: QuestionViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
    }
}

