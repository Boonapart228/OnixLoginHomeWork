package com.example.onixloginhomework.response

import kotlinx.serialization.Serializable

@Serializable
data class QuestionResponse(
    val answers: List<AnswerResponse>,
    val questionType: String?,
    val title: String?,
    val url: String?
)