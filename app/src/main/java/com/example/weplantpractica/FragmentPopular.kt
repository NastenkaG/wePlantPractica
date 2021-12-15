package com.example.weplantpractica

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentLibraryPopularBinding

class FragmentPopular : Fragment() {
    lateinit var binding: FragmentLibraryPopularBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLibraryPopularBinding.inflate(inflater, container, false)
        binding.popularImagePlantIndoor.setOnClickListener {
            val intent = Intent(context, PlantActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}