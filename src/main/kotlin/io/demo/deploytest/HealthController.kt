package io.demo.deploytest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {
    @GetMapping("/health")
    fun healthCheck(): String {
        return "ok last check!!!! plzzzzz"
    }
}