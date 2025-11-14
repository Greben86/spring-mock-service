package com.greben.spring_mock_service

import com.fasterxml.jackson.annotation.JsonValue

enum class SentimentType(@JsonValue val sentimentName: String) {
    POSITIVE("позитивный"),
    NEGATIVE("негативный"),
    NEUTRAL("нейтральный");
}