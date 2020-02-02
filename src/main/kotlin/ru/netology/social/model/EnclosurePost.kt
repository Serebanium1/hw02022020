package ru.netology.social.model

class EnclosurePost (
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val friendsOnly: Boolean,
    val postType: String,
    val postSource: PostSource
)
