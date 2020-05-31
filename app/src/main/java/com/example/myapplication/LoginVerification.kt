package com.example.myapplication

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "test@craig.com" &&
                password == "testing") ||
                (email == "admin@craig.com" &&
                        password == "testing")
    }
}