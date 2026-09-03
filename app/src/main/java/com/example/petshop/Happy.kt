package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun representMood(): String {
        return "I am happy :)"
    }
}