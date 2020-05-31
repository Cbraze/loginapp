package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val verification = LoginVerification()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2.toLong())
    }

    @Test
    fun loginSuccessful_whenCorrectCredentials() {
        assertTrue(verification.verify("test@craig.com", "testing"))
    }

    @Test
    fun loginFails_whenWrongEmail() {
        assertTrue(verification.verify("test@craig.com", "testing"))
    }
}