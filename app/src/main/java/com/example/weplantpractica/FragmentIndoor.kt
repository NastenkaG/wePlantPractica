package com.example.weplantpractica

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentLibraryIndoorBinding

class FragmentIndoor : Fragment() {
    lateinit var binding: FragmentLibraryIndoorBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLibraryIndoorBinding.inflate(inflater, container, false)
        binding.indoorImagePlantIndoor.setOnClickListener {
            val intent = Intent(context, PlantActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}