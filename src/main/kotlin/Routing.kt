package com.example

import com.example.model.User
import com.example.repository.UserRepository
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.eq
import org.litote.kmongo.findOne

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!l adkfishdjshs")
        }
    }
}
fun Route.addUserRoute(userCollection: CoroutineCollection<User>) {
    post("/users") {
        val userRequest = call.receive<User>()
        val existingUser = userCollection.findOne(User::email eq userRequest.email)
        if (existingUser != null) {
            call.respond(HttpStatusCode.Conflict, mapOf("error" to "Email already registered"))
            return@post
        }
        val result = userCollection.insertOne(userRequest)
        if (result.wasAcknowledged()) {
            call.respond(HttpStatusCode.Created, mapOf("message" to "Registration Successful"))
        } else {
            call.respond(HttpStatusCode.InternalServerError, mapOf("error" to "Failed to register user"))
        }
    }
}