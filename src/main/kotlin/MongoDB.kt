package com.example
import org.litote.kmongo.coroutine.*
import org.litote.kmongo.reactivestreams.KMongo

object MongoDB {
    private const val CONNECTION_STRING = "mongodb+srv://tle46495:<db_password>@cluster0.qig2i.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
    private const val DATABASE_NAME = "blinkNotes"

    private val client = KMongo.createClient(CONNECTION_STRING).coroutine
    val database = client.getDatabase(DATABASE_NAME)
}
