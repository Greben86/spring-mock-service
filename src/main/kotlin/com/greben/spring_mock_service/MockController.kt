package com.greben.spring_mock_service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class MockController {

    @GetMapping("/api/sentiment")
    fun sentiment(@RequestParam("text") test: String): Mono<Response?> = Mono.just(
        Response(SentimentType.entries.random())
    )
}