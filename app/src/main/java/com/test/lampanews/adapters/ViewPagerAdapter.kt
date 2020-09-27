package com.test.lampanews.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.test.lampanews.fragments.NewsFragment


open class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NewsFragment.newInstance("favourites")
            1 -> NewsFragment.newInstance("strories")
            2 -> NewsFragment.newInstance("video")
            else -> NewsFragment.newInstance("favourites")
        }
    }
}