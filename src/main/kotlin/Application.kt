package com.example

import com.example.model.User
import com.example.repository.UserRepository
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureRouting()

val userCollection = MongoDB.database.getCollection<User>()
    routing {
        addUserRoute(userCollection)
    }
}
