package com.example.onixloginhomework.maper

import com.example.onixloginhomework.entity.AnswerEntity
import com.example.onixloginhomework.entity.QuestionEntity
import com.example.onixloginhomework.entity.QuestionsEntity
import com.example.onixloginhomework.response.AnswerResponse
import com.example.onixloginhomework.response.QuestionResponse
import com.example.onixloginhomework.response.QuestionsResponse

fun mapResponse(response: QuestionsResponse): QuestionsEntity {
    return QuestionsEntity(response.question.map { mapQuestionResponse(it) })
}

fun mapQuestionResponse(response: QuestionResponse): QuestionEntity {
    return QuestionEntity(
        answers = response.answers.map { mapAnswerResponse(it) },
        questionType = response.questionType ?: "",
        title = response.title ?: "",
        url = response.url ?: ""
    )
}

fun mapAnswerResponse(response: AnswerResponse): AnswerEntity {
    return AnswerEntity(
        isCorrect = response.isCorrect ?: false,
        title = response.title ?: "",
        url = response.url ?: ""
    )
}