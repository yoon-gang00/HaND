package com.example.hand

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        // 2초 후 MainActivity로 이동
        Handler().postDelayed({
            val intent = Intent(this, NaviActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}