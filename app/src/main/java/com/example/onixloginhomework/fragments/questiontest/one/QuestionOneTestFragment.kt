package com.example.onixloginhomework.fragments.questiontest.one

import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentOneQuestionBinding
import com.example.onixloginhomework.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuestionOneTestFragment :
    BaseFragment<FragmentOneQuestionBinding>(contentLayoutID = R.layout.fragment_one_question) {
    private val viewModel: QuestionOneTestViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        super.onViewCreated(view, savedInstanceState)


        Glide.with(this)
            .load("https://db.rising-gods.de/static/images/wow/icons/large/spell_nature_polymorph.jpg")
            .into(binding.imageViewTwo);

        Glide.with(this)
            .load("https://wow.zamimg.com/uploads/blog/images/12837-3d.png")
            .into(binding.imageViewOneOne);
        Glide.with(this)
            .load("https://wow.zamimg.com/uploads/screenshots/normal/921898-worgen-character-customization.jpg")
            .into(binding.imageViewOneTwo);
        Glide.with(this)
            .load("https://wow.zamimg.com/uploads/screenshots/normal/925642.jpg")
            .into(binding.imageViewOneThree);
        Glide.with(this)
            .load("https://images.noob-club.ru/news/2018/10/bqvmdkwgjf.jpg")
            .into(binding.imageViewOneFour);
    }

    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::navigate)
        viewModel.backNavigate.observe(viewLifecycleOwner) {
            back()

        }
    }
}