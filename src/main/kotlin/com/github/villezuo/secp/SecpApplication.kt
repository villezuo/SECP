package com.github.villezuo.secp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecpApplication

fun main(args: Array<String>) {
    runApplication<SecpApplication>(*args)
}
