package com.example.weplantpractica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weplantpractica.databinding.SplashScreenBinding

class ScreenSplash : AppCompatActivity() {
    lateinit var binding: SplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.splashButton.setOnClickListener {
            val intent = Intent(this, ScreenMenu::class.java)
            startActivity(intent)
        }
    }
}