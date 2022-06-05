package com.example.onixloginhomework.repository

import com.example.onixloginhomework.entity.QuestionsEntity
import com.example.onixloginhomework.json
import com.example.onixloginhomework.maper.mapResponse
import com.example.onixloginhomework.response.QuestionsResponse
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class ResponseRepository {
    fun getQuestions(): QuestionsEntity {
        val data = Json { ignoreUnknownKeys = true }
        return mapResponse(data.decodeFromString<QuestionsResponse>(json))
    }
}
