package com.rajneesh.foodrunner

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val txtDashboardId : TextView = findViewById(R.id.txtDashboardId)
        val txtDashboardPassword: TextView = findViewById(R.id.txtDashboardPassword)

        val strUser: String? = intent.getStringExtra("login_key")
        val strPassword: String? = intent.getStringExtra("pass_key")

        txtDashboardId.text = strUser
        txtDashboardPassword.text = strPassword



        title = "FoodRunner"
    }
}