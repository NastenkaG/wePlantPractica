package com.example.weplantpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weplantpractica.databinding.ActivityMenuScreenBinding

class MenuScreen : AppCompatActivity() {
    lateinit var binding: ActivityMenuScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuScreenBinding.inflate(layoutInflater)
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