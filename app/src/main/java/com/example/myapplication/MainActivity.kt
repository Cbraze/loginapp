package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextTextEmailAddress)
        password = findViewById(R.id.editTextTextPassword2)
        login = findViewById(R.id.button)

        login.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        if (loginVerification.verify(
                email.text.toString(),
                password.text.toString()
            )
        ) {
            Log.d("PASSWORD SUCCESSFUL", password.text.toString())
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        } else {
            Log.d("PASSWORD FAILED", password.text.toString())
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        }

    }
}