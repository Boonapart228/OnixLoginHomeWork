package com.example.onixloginhomework.response

import kotlinx.serialization.Serializable

@Serializable
data class QuestionsResponse(
    val question: List<QuestionResponse>
)