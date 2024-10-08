package com.praspit.personalportfolio.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PortfolioController {
    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello world!"
    }
}