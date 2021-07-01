package com.rajneesh.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        title = "Register Yourself"

        val registorButton: TextView = findViewById(R.id.Register_btn)
        val editname: TextView = findViewById(R.id.edit_Name)
        val editemail: TextView = findViewById(R.id.edit_Email)
        val editnumber: TextView = findViewById(R.id.edit_Number)
        val editdelivery: TextView = findViewById(R.id.edit_delivery)
        val edirpassword: TextView = findViewById(R.id.edit_Password)
        val editconfirm: TextView = findViewById(R.id.edit_Confirm)

        registorButton.setOnClickListener {

            val name = editname.text.toString()
            val email = editemail.text.toString()
            val number = editnumber.text.toString()
            val delivery = editdelivery.text.toString()
            val password = edirpassword.text.toString()
            val confirm = editconfirm.text.toString()

            val Intent = Intent(this@Register,AfterRegistor::class.java)

            Intent.putExtra("name",name)
            Intent.putExtra("email",email)
            Intent.putExtra("number",number)
            Intent.putExtra("delivery",delivery)
            Intent.putExtra("password",password)
            Intent.putExtra("confirm",confirm)

            startActivity(Intent)

        }

    }
}