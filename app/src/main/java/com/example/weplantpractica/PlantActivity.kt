package com.example.weplantpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weplantpractica.databinding.ActivityPlantBinding

class PlantActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plantExit.setOnClickListener {
            finish()
        }
    }
}