package com.rajneesh.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AfterForgot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_forgot)

        val ForgotEmail:TextView = findViewById(R.id.forgotEmail)
        val ForgotPassword:TextView = findViewById(R.id.forgotNumber)

        val strEmail: String? = intent.getStringExtra("email")
        val strNumber: String? = intent.getStringExtra("number")

        ForgotEmail.text = strEmail
        ForgotPassword.text = strNumber

        title = "Forgoted"

    }
}