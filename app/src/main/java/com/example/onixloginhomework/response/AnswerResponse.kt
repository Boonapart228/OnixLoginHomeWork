package com.example.onixloginhomework.response

import kotlinx.serialization.Serializable

@Serializable
data class AnswerResponse(
    val isCorrect: Boolean?,
    val title: String?,
    val url: String?
)