package com.example.repository

import com.example.MongoDB
import com.example.model.User
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import org.bson.Document
import org.litote.kmongo.KMongo
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.eq
import org.litote.kmongo.getCollection

object UserRepository {
    private val client: MongoClient = KMongo.createClient("") // Thay đổi URI nếu cần
    private val database = client.getDatabase("blinkNotes") // Thay đổi tên database

    val usersCollection: MongoCollection<User> = database.getCollection<User>()

}
    //http://127.0.0.1:8080