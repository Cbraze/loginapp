package com.example.myapplication

class LoginVerification {
    fun verifyEmailAndPAssword(email: String, password: String): Boolean {
        return email == "test@craig.com" &&
                password == "testing"
    }
}