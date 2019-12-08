package com.bdtech.restaurant.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bdtech.restaurant.model.FragmentModel

class MyPagerAdapter(
    fm: FragmentManager,
    val dataList: ArrayList<FragmentModel>
) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return dataList.get(position).fragment!!
    }

    override fun getCount(): Int {
        return dataList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return dataList.get(position).name
    }
}