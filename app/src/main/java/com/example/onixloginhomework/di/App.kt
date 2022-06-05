package com.example.onixloginhomework.di

import com.example.onixloginhomework.fragments.resultSplash.SplashResultViewModel
import com.example.onixloginhomework.fragments.login.LoginViewModel
import com.example.onixloginhomework.fragments.question.QuestionViewModel
import com.example.onixloginhomework.fragments.result.ResultViewModel
import com.example.onixloginhomework.fragments.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<LoginViewModel> { LoginViewModel() }
    viewModel<QuestionViewModel> { QuestionViewModel() }
    viewModel<ResultViewModel> { ResultViewModel() }
    viewModel<SplashViewModel> { SplashViewModel() }
    viewModel<SplashResultViewModel>{ SplashResultViewModel() }
}
