package com.rajneesh.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AfterRegistor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_registor)

        val name: TextView = findViewById(R.id.name)
        val email: TextView = findViewById(R.id.email)
        val number: TextView = findViewById(R.id.number)
        val delivery: TextView = findViewById(R.id.delivery)
        val password: TextView = findViewById(R.id.password)
        val confirm: TextView = findViewById(R.id.confirm)


        val setname: String? = intent.getStringExtra("name")
        val setemail: String? = intent.getStringExtra("email")
        val setnumber: String? = intent.getStringExtra("number")
        val setdelivery: String? = intent.getStringExtra("delivery")
        val setpassword: String? = intent.getStringExtra("password")
        val setconfirm: String? = intent.getStringExtra("confirm")


        name.text = setname
        email.text = setemail
        number.text = setnumber
        delivery.text = setdelivery
        password.text = setpassword
        confirm.text = setconfirm


    }
}