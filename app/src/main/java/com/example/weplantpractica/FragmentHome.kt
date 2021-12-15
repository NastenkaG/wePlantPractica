package com.example.weplantpractica

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {
        lateinit var binding: FragmentHomeBinding
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentHomeBinding.inflate(inflater, container, false)
            binding.imageView.setOnClickListener{
                val intent = Intent(context, WateringActivity::class.java)
                startActivity(intent)
            }
            binding.imageView2.setOnClickListener{
                val intent = Intent(context, LightActivity::class.java)
                startActivity(intent)
            }
            return binding.root
    }
}