package com.example.weplantpractica

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentLibraryBinding
import com.google.android.material.tabs.TabLayoutMediator

class FragmentLibrary() : Fragment() {
    lateinit var binding: FragmentLibraryBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLibraryBinding.inflate(inflater, container, false)
        binding.taskFragmentPager.adapter = MyPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.taskFragmentPager){ tab, position ->
            when(position){
                0 -> tab.text = getString(R.string.tab1)
                1 -> tab.text = getString(R.string.tab2)
                2 -> tab.text = getString(R.string.tab3)
                3 -> tab.text = getString(R.string.tab4)
            }
        }.attach()
        return binding.root
    }
}