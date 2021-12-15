package com.example.weplantpractica

import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentIndoor()
            1 -> FragmentPopular()
            2 -> FragmentAnimal()
            3 -> FragmentLight()
            else -> NewFragment(4)
        }
    }
}