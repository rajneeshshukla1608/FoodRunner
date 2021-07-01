package com.rajneesh.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val next: Button = findViewById(R.id.forgot_btn)
        next.setOnClickListener {

            val editEMail:TextView = findViewById(R.id.edit_Email)
            val editNumber: TextView = findViewById(R.id.edit_Number)

            val email = editEMail.text.toString()
            val number = editNumber.text.toString()
            val intent = Intent(this@ForgotPassword,AfterForgot::class.java)

            intent.putExtra("email",email)
            intent.putExtra("number",number)
            startActivity(intent)


        }
    }
}