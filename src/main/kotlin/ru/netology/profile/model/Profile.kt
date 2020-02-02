package ru.netology.profile.model

class Profile(
    val id: String,
    val login: String,
    private val firstName: String,
    private val lastName: String,
    val status: String,
    val avatar: String
) {
    val fullName: String
        get() = "$firstName $lastName"
}
