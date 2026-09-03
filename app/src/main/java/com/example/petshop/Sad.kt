package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun representMood(): String {
        return "I am sad :("
    }
}