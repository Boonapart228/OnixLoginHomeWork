package com.example.onixloginhomework.entity




data class QuestionEntity(
    val answers: List<AnswerEntity>,
    val questionType: String,
    val title: String,
    val url: String
)