package com.example.model

import org.bson.codecs.pojo.annotations.BsonId
import java.util.*

import kotlinx.serialization.Serializable
import org.bson.types.ObjectId

data class User(
    @BsonId val id: String = ObjectId().toString(),
    val username: String,
    val email: String,
    val profileImage: String,
    val followers: List<String> = emptyList(),
    val following: List<String> = emptyList(),
    val createdAt: Long = System.currentTimeMillis()
)