package com.example.weplantpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weplantpractica.databinding.ActivityLightBinding

class LightActivity : AppCompatActivity() {
    lateinit var binding: ActivityLightBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLightBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lightBack.setOnClickListener {
            finish()
        }
    }
}