package io.demo.deploytest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeployTestApplication

fun main(args: Array<String>) {
    runApplication<DeployTestApplication>(*args)
}
