package com.example.weplantpractica

import android.os.Bundle
import com.example.weplantpractica.databinding.MenuScreenBinding
import androidx.appcompat.app.AppCompatActivity

class ScreenMenu : AppCompatActivity() {
    lateinit var binding: MenuScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.menuBottomNavigation.setOnItemSelectedListener { menu ->
            when (menu.itemId) {
                R.id.menuFragmentHome -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.menuFragmentContainerView, FragmentHome())
                        .commit()
                }
                R.id.menuFragmentLibrary -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.menuFragmentContainerView, FragmentLibrary())
                        .commit()
                }
                R.id.menuFragmentAid -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.menuFragmentContainerView, FragmentAid())
                        .commit()
                }
                R.id.menuFragmentCommunity -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.menuFragmentContainerView, FragmentCommunity())
                        .commit()
                }
            }
            true
        }
    }
}