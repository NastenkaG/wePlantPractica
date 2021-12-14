package com.example.weplantpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weplantpractica.databinding.ActivityWateringBinding

class WateringActivity : AppCompatActivity() {
    lateinit var binding: ActivityWateringBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWateringBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.wateringBack.setOnClickListener{
            finish()
        }
    }
}