package com.ifs21001.delcomtodo.presentation.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ifs21001.delcomtodo.R

class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {
                startActivity(Intent(this@SplashScreenActivity, LoginActivity::class.java))
                finish()
            }, 2000
        )
    }
}