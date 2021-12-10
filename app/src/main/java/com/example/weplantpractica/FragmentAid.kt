package com.example.weplantpractica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentAidBinding

class FragmentAid : Fragment() {
    lateinit var binding: FragmentAidBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAidBinding.inflate(inflater, container, false)
        return binding.root
    }
}