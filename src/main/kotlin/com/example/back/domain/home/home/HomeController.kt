package com.example.back.domain.home.home

@RestController
class HomeController {

    @GetMapping("/home")
    fun home(): String {
        return "Hello Kotlin!"
    }
}