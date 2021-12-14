package com.example.weplantpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weplantpractica.databinding.ActivityRopottingBinding

class RepottingActivity : AppCompatActivity() {
    lateinit var binding: ActivityRopottingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRopottingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.repottingBack.setOnClickListener {
            finish()
        }
    }
}