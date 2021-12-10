package com.example.weplantpractica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentHomeBinding
import com.example.weplantpractica.databinding.FragmentLibraryBinding

class FragmentLibrary : Fragment() {
    lateinit var binding: FragmentLibraryBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLibraryBinding.inflate(inflater, container, false)
        return binding.root
    }
}