package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val userProfile = Profile("ab115", "s.ivanov", "Sergey", "Ivanov", "Online", "D:/ava.jpg")
    println(userProfile.fullName)
}