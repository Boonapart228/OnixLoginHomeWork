package com.example.onixloginhomework.fragments.questiontest.three

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.onixloginhomework.singleLiveEvent.SingleLiveEvent

class QuestionThreeTestViewModel : ViewModel() {
    private val _navigate = SingleLiveEvent<NavDirections>()
    private val _backNavigate = SingleLiveEvent<Boolean>()
    val navigate: LiveData<NavDirections> = _navigate
    val backNavigate: LiveData<Boolean> = _backNavigate
    val model: QuestionThreeTestModel = QuestionThreeTestModel()
    var scoreOne = 0
    var scoreTwo = 0
    fun onNextClick() {
        if (model.touchQuestionOne && model.touchQuestionTwo && model.touchQuestionThree) {
            model.touchQuestionOne = false
            model.touchQuestionTwo = false
            model.touchQuestionThree = false
            model.scoreThree =
                model.scoreTwoQuestionThree + model.scoreThreeQuestionThree + model.scoreOneQuestionThree
            _navigate.value =
                QuestionThreeTestFragmentDirections.actionQuestionThreeTestFragmentToSplashResultFragment(
                    scoreOne,
                    scoreTwo,
                    model.scoreThree
                )

        }
    }

    fun onBackClick() {

        _backNavigate.value = true
    }

    fun onAnswerTrue() {
        model.touchQuestionOne = true
        model.scoreOneQuestionThree = 1
        Log.d("DearLogOne", "${model.scoreOneQuestionThree}")
    }

    fun onAnswerFalse() {
        model.touchQuestionOne = true
        model.scoreOneQuestionThree = 0
        Log.d("DearLogOne", "${model.scoreOneQuestionThree}")
    }

    fun buttonOne() {
        model.touchQuestionTwo = true
        Log.d("D", "${model.editTextOneTestViewModel.get()}")
        if (model.editTextOneTestViewModel.get() == "Atheroth") {
            model.scoreTwoQuestionThree = 1
            Log.d("Dddd", "${model.scoreTwoQuestionThree}")
        } else {
            model.scoreTwoQuestionThree = 0
            Log.d("Dddd", "${model.scoreTwoQuestionThree}")
        }

    }

    fun buttonTwo() {
        model.touchQuestionThree = true
        Log.d("Dddd", "${model.editTextTwoTestViewModel.get()}")
        if (model.editTextTwoTestViewModel.get() == "Paladin" || model.editTextTwoTestViewModel.get() == "paladin") {
            model.scoreThreeQuestionThree = 1
            Log.d("Dddd", "${model.scoreThreeQuestionThree}")
        } else {
            model.scoreThreeQuestionThree = 0
            Log.d("Dddd", "${model.scoreThreeQuestionThree}")
        }
    }


}