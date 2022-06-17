package com.example.onixloginhomework.fragments.questiontest.two

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentTwoQuestionBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class QuestionTwoTestFragment :
    BaseFragment<FragmentTwoQuestionBinding>(contentLayoutID = R.layout.fragment_two_question) {
    private val viewModel: QuestionTwoTestViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        val scoreOnes : QuestionTwoTestFragmentArgs by navArgs()
        super.onViewCreated(view, savedInstanceState)
        viewModel.scoreOnes = scoreOnes.scoreOnes

        Glide.with(this)
            .load("https://wow.zamimg.com/uploads/screenshots/normal/943107-.jpg")
            .into(binding.imageViewSeven);
        Glide.with(this)
            .load("https://genapilot.ru/wp-content/uploads/2019/09/wow-classic-mounts-10.jpg")
            .into(binding.imageViewTwoOne);
        Glide.with(this)
            .load("https://genapilot.ru/wp-content/uploads/2019/09/wow-classic-mounts-9.jpg")
            .into(binding.imageViewTwoTwo);
        Glide.with(this)
            .load("https://genapilot.ru/wp-content/uploads/2019/09/wow-classic-mounts-13.jpg")
            .into(binding.imageViewTwoThree);
        Glide.with(this)
            .load("https://genapilot.ru/wp-content/uploads/2019/09/wow-classic-mounts-6.jpg")
            .into(binding.imageViewTwoFour);
    }

    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::navigate)
        viewModel.backNavigate.observe(viewLifecycleOwner) {
            back()

        }

    }
}