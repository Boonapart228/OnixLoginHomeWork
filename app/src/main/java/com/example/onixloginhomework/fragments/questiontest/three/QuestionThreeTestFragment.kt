package com.example.onixloginhomework.fragments.questiontest.three

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.onixloginhomework.R
import com.example.onixloginhomework.databinding.FragmentThreeQuestionBinding
import com.example.onixloginhomework.fragments.base.BaseFragment

import org.koin.androidx.viewmodel.ext.android.viewModel

class QuestionThreeTestFragment :
    BaseFragment<FragmentThreeQuestionBinding>(contentLayoutID = R.layout.fragment_three_question) {
    private val viewModel: QuestionThreeTestViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        binding.model = viewModel.model
        val scoreOnes : QuestionThreeTestFragmentArgs by navArgs()
        viewModel.scoreOne = scoreOnes.scoreOnes
        viewModel.scoreTwo = scoreOnes.kverty
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this)
            .load("https://static.wikia.nocookie.net/wowwiki/images/4/4b/WorldMap-World26567.jpg/revision/latest?cb=20180814230202")
            .into(binding.imageViewEight);
        Glide.with(this)
            .load("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/000db92f-120d-4e84-917c-38eae0c10578/da0nwpq-9da7013c-6900-470f-9084-22511cca4db9.png/v1/fill/w_894,h_894,q_70,strp/paladin_icon_by_tayrobertsart_da0nwpq-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTAyNCIsInBhdGgiOiJcL2ZcLzAwMGRiOTJmLTEyMGQtNGU4NC05MTdjLTM4ZWFlMGMxMDU3OFwvZGEwbndwcS05ZGE3MDEzYy02OTAwLTQ3MGYtOTA4NC0yMjUxMWNjYTRkYjkucG5nIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.6y_ZEbWS3bbs3BEpoUXEp_EIsLXVk5345NsAirn5S-A")
            .into(binding.imageViewTen);
    }



    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::navigate)
        viewModel.backNavigate.observe(viewLifecycleOwner) {
            back()

        }
    }
}