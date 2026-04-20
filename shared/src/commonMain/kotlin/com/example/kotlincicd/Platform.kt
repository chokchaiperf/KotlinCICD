package com.example.kotlincicd

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform