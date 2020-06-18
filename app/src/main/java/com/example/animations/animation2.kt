package com.example.animations

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Animation2 : AppCompatActivity(){

    lateinit var img : ImageView
    lateinit var animation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation2)

            img = findViewById(R.id.imageView2)
            animation = AnimationUtils.loadAnimation(this, R.anim.animation2)
            img.startAnimation(animation)
        }
    }