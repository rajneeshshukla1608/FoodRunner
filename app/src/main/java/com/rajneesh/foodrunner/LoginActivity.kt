package com.rajneesh.foodrunner

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var sharedPreference: SharedPreferences

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sharedPreference = getSharedPreferences("login preferences",Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreference.getBoolean("isLoggedIn", false)
        setContentView(R.layout.activity_login)

        if (isLoggedIn) {
            val Intent = Intent(this@LoginActivity, Dashboard::class.java)
            startActivity(Intent)
            finish()
        } else {
            sharedPreference.edit().putBoolean("isLoggedIn", true).apply()
        }

        val forgotPassword:TextView = findViewById(R.id.forgot_pass)
        val loginId: TextView = findViewById(R.id.edit_1)
        val loginPass: TextView = findViewById(R.id.edit_2)
        val btnlogin:Button = findViewById(R.id.login_btn)
        val register: TextView = findViewById(R.id.sign_up)

       forgotPassword.setOnClickListener {
           val intent = Intent(this@LoginActivity,ForgotPassword::class.java)
           startActivity(intent)
       }
        btnlogin.setOnClickListener {

             val string1 = loginId.text.toString()
            val string2  = loginPass.text.toString()
            val intent = Intent(this@LoginActivity,Dashboard::class.java)
            intent.putExtra("login_key", string1)
            intent.putExtra("pass_key", string2)
            startActivity(intent)
        }

        register.setOnClickListener {
            val intent = Intent(this@LoginActivity,Register::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}