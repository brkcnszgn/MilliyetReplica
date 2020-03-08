package com.example.milliyetreplica.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.milliyetreplica.model.FragmentModel

class CategoryAdapter(
    fragmentManager: FragmentManager,
    private val newFragmentList: List<FragmentModel>
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return newFragmentList[position].fragment
    }

    override fun getCount(): Int {
        return newFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return newFragmentList[position].fragmentTitle
    }
}