package com.rajneesh.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        1st method to made delay mostly used to make the splash screen
//
//        Handler().postDelayed({
//            val startAct = Intent(this@splash, LoginActivity::class.java)
//            startActivity(startAct)
//        }, 2000)

          //this below method is more effective than above i love this method as said kotlin gives the easiness to do big work in less code

                object : CountDownTimer(2000, 1000){
            override fun onTick(millisUntilFinished: Long) {
           }
           override fun onFinish() {
                val intent = Intent(this@splash, LoginActivity::class.java)
                startActivity(intent)
           }
        }.start()
    }
       override fun onPause() {
            super.onPause()
            finish()
        }

    }