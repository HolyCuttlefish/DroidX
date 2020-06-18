package com.example.animations

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Animation : AppCompatActivity(){

    lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation)

            img = findViewById(R.id.imageView)
            img.setBackgroundResource(R.drawable.animation)
            (img.background as AnimationDrawable).start()
    }
}