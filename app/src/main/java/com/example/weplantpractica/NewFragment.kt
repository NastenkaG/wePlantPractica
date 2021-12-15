package com.example.weplantpractica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.NewFragmentBinding

class NewFragment(private val position: Int) : Fragment() {
    lateinit var binding : NewFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = NewFragmentBinding.inflate(inflater, container, false)
        when (position) {
            0 -> FragmentIndoor()
            1 -> FragmentAnimal()
            2 -> FragmentPopular()
            3 -> FragmentLight()
        }
        return binding.root
    }
}