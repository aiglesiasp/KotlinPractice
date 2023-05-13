package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Challenge00 - RETOBUZZ
        val challenge00: Challenge00 = Challenge00()
        challenge00.main()
    }
}