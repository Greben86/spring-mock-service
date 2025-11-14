package com.greben.spring_mock_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.config.EnableWebFlux
import reactor.core.publisher.Mono

@SpringBootApplication
@EnableWebFlux
class SpringMockServiceApplication

fun main(args: Array<String>) {
	runApplication<SpringMockServiceApplication>(*args)
}
