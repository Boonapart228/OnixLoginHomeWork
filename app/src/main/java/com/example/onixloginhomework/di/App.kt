package com.example.onixloginhomework.di

import com.example.onixloginhomework.fragments.questiontest.one.QuestionOneTestViewModel
import com.example.onixloginhomework.fragments.questiontest.three.QuestionThreeTestViewModel
import com.example.onixloginhomework.fragments.questiontest.two.QuestionTwoTestViewModel
import com.example.onixloginhomework.fragments.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<QuestionOneTestViewModel>{QuestionOneTestViewModel()}
    viewModel<QuestionTwoTestViewModel>{ QuestionTwoTestViewModel() }
    viewModel<QuestionThreeTestViewModel>{QuestionThreeTestViewModel()}
    viewModel<SplashViewModel> { SplashViewModel() }

}
