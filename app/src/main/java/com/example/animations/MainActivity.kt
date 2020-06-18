package com.example.animations

import android.content.Intent
//ДОБАВИТЬ ЛИБУ!!!
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Animation(View : View)
    {
        try {

            var intent = Intent(this, Animation::class.java)
            startActivity(intent)
        }
        catch (e : Exception)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    fun Animation2(View : View)
    {
        var intent = Intent(this, Animation2::class.java)
        startActivity(intent)
    }

}
