package com.example.onixloginhomework.fragments.questiontest.one

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.onixloginhomework.singleLiveEvent.SingleLiveEvent

class QuestionOneTestViewModel : ViewModel() {
    private val _navigate = SingleLiveEvent<NavDirections>()
    private val _backNavigate = SingleLiveEvent<Boolean>()
    val navigate: LiveData<NavDirections> = _navigate
    val backNavigate: LiveData<Boolean> = _backNavigate
    val viewModel: QuestionOneTestModel = QuestionOneTestModel()
    fun onNextClick() {
        if (viewModel.touchQuestionOne && viewModel.touchQuestionTwo && viewModel.touchQuestionThree) {
            viewModel.touchQuestionOne = false
            viewModel.touchQuestionTwo = false
            viewModel.touchQuestionThree = false
            viewModel.scoreOne =
                viewModel.scoreOneQuestionOne + viewModel.scoreTwoQuestionOne + viewModel.scoreThreeQuestionOne
            _navigate.value =
                QuestionOneTestFragmentDirections.actionQuestionOneTestFragmentToQuestionTwoTestFragment(
                    viewModel.scoreOne
                )
        }
    }

    fun onAnswerTrueRadio() {
        viewModel.scoreOneQuestionOne = 1
        viewModel.touchQuestionOne = true

    }

    fun onAnswerFalseRadio() {
        viewModel.scoreOneQuestionOne = 0
        Log.d("myLog", "${viewModel.scoreOneQuestionOne}")
        viewModel.touchQuestionOne = true
    }

    fun onAnswerCheckOne(isChecked: Boolean) {
        viewModel.checkOne = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkOne}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckTwo(isChecked: Boolean) {
        viewModel.checkTwo = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkTwo}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckThree(isChecked: Boolean) {
        viewModel.checkThree = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkThree}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckFour(isChecked: Boolean) {
        viewModel.checkFour = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkFour}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckFive(isChecked: Boolean) {
        viewModel.checkFive = isChecked
        viewModel.touchQuestionThree = true
        Log.d("myLog", "${viewModel.checkFive}")
        if (viewModel.checkSeven && viewModel.checkEight && !viewModel.checkFive && !viewModel.checkSix) {
            viewModel.scoreThreeQuestionOne = 1
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        } else {
            viewModel.scoreThreeQuestionOne = 0
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        }
    }

    fun onAnswerCheckSix(isChecked: Boolean) {
        viewModel.checkSix = isChecked
        viewModel.touchQuestionThree = true
        Log.d("myLog", "${viewModel.checkFive}")
        if (viewModel.checkSeven && viewModel.checkEight && !viewModel.checkFive && !viewModel.checkSix) {
            viewModel.scoreThreeQuestionOne = 1
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        } else {
            viewModel.scoreThreeQuestionOne = 0
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        }
    }

    fun onAnswerCheckSeven(isChecked: Boolean) {
        viewModel.checkSeven = isChecked
        viewModel.touchQuestionThree = true
        Log.d("myLog", "${viewModel.checkFive}")
        if (viewModel.checkSeven && viewModel.checkEight && !viewModel.checkFive && !viewModel.checkSix) {
            viewModel.scoreThreeQuestionOne = 1
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        } else {
            viewModel.scoreThreeQuestionOne = 0
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        }

    }

    fun onAnswerCheckEight(isChecked: Boolean) {
        viewModel.checkEight = isChecked
        viewModel.touchQuestionThree = true
        Log.d("myLog", "${viewModel.checkFive}")
        if (viewModel.checkSeven && viewModel.checkEight && !viewModel.checkFive && !viewModel.checkSix) {
            viewModel.scoreThreeQuestionOne = 1
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        } else {
            viewModel.scoreThreeQuestionOne = 0
            Log.d("ScoreLog", "${viewModel.scoreThreeQuestionOne}")
        }
    }


}
