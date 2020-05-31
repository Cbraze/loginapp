package com.example.myapplication

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return email == "test@craig.com" &&
                password == "testing"
    }
}