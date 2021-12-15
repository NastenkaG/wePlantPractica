package com.example.weplantpractica

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentLibraryAnimalBinding

class FragmentAnimal : Fragment() {
    lateinit var binding: FragmentLibraryAnimalBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLibraryAnimalBinding.inflate(inflater, container, false)
        binding.animalImagePlantIndoor.setOnClickListener {
            val intent = Intent(context, PlantActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}