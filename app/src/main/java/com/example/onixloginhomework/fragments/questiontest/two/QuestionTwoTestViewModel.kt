package com.example.onixloginhomework.fragments.questiontest.two

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.onixloginhomework.singleLiveEvent.SingleLiveEvent


class QuestionTwoTestViewModel : ViewModel() {
    private val _navigate = SingleLiveEvent<NavDirections>()
    private val _backNavigate = SingleLiveEvent<Boolean>()
    val navigate: LiveData<NavDirections> = _navigate
    val backNavigate: LiveData<Boolean> = _backNavigate
    val viewModel: QuestionTwoTestModel = QuestionTwoTestModel()
    var scoreOnes = 0
    fun onNextClick() {
        if (viewModel.touchQuestionOne && viewModel.touchQuestionTwo && viewModel.touchQuestionThree) {
            viewModel.touchQuestionOne = false
            viewModel.touchQuestionTwo = false
            viewModel.touchQuestionThree = false
            viewModel.scoreTwo =
                viewModel.scoreOneQuestionTwo + viewModel.scoreTwoQuestionTwo + viewModel.scoreThreeQuestionTwo
            _navigate.value =
                QuestionTwoTestFragmentDirections.actionQuestionTwoTestFragmentToQuestionThreeTestFragment(
                    viewModel.scoreTwo,
                    scoreOnes
                )
        }
    }

    fun onBackClick() {
        _backNavigate.value = true
    }

    fun onAnswerTrueRadioOne() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 1
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")
    }

    fun onAnswerFalseRadioOne() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 0
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")

    }

    fun onAnswerTrueRadioTwo() {
        viewModel.touchQuestionTwo = true
        viewModel.scoreTwoQuestionTwo = 1
        Log.d("TwoTLogScore", "${viewModel.scoreTwoQuestionTwo}")
    }

    fun onAnswerFalseRadioTwo() {
        viewModel.touchQuestionTwo = true
        viewModel.scoreTwoQuestionTwo = 0
        Log.d("TwoTLogScore", "${viewModel.scoreTwoQuestionTwo}")
    }

    fun onAnswerCheckNine(isChecked: Boolean) {
        viewModel.touchQuestionThree = true
        viewModel.checkNine = isChecked
        Log.d("myLog", "${viewModel.checkNine}")
        if (viewModel.checkNine && !viewModel.checkTen && !viewModel.checkEleven && viewModel.checkTwelve) {
            viewModel.scoreThreeQuestionTwo = 1
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        } else {
            viewModel.scoreThreeQuestionTwo = 0
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        }
    }

    fun onAnswerCheckTen(isChecked: Boolean) {
        viewModel.touchQuestionThree = true
        viewModel.checkTen = isChecked
        Log.d("myLog", "${viewModel.checkTen}")
        if (viewModel.checkNine && !viewModel.checkTen && !viewModel.checkEleven && viewModel.checkTwelve) {
            viewModel.scoreThreeQuestionTwo = 1
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        } else {
            viewModel.scoreThreeQuestionTwo = 0
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        }
    }

    fun onAnswerCheckEleven(isChecked: Boolean) {
        viewModel.touchQuestionThree = true
        viewModel.checkEleven = isChecked
        Log.d("myLog", "${viewModel.checkEleven}")
        if (viewModel.checkNine && !viewModel.checkTen && !viewModel.checkEleven && viewModel.checkTwelve) {
            viewModel.scoreThreeQuestionTwo = 1
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        } else {
            viewModel.scoreThreeQuestionTwo = 0
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        }
    }

    fun onAnswerCheckTwelve(isChecked: Boolean) {
        viewModel.touchQuestionThree = true
        viewModel.checkTwelve = isChecked
        Log.d("myLog", "${viewModel.checkTwelve}")
        if (viewModel.checkNine && !viewModel.checkTen && !viewModel.checkEleven && viewModel.checkTwelve) {
            viewModel.scoreThreeQuestionTwo = 1
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        } else {
            viewModel.scoreThreeQuestionTwo = 0
            Log.d("TwoHHLogScore", "${viewModel.scoreThreeQuestionTwo}")
        }

    }
}