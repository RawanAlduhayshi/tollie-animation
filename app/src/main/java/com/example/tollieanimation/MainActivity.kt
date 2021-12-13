package com.example.tollieanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation = findViewById<LottieAnimationView>(R.id.animationView)
        with(animation) {
            setMinAndMaxFrame(30, 50)
        }

    }
}
