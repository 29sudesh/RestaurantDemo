package com.bdtech.restaurant.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bdtech.restaurant.R
import com.bdtech.restaurant.controller.MyPagerAdapter
import com.bdtech.restaurant.model.FragmentModel
import com.bdtech.restaurant.view.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.layout_topbar.*

class HomeFragment : BaseFragment() {
    var myView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (myView == null) {
            myView = inflater.inflate(R.layout.fragment_home, container, false)
        }

        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentAdapter = MyPagerAdapter(childFragmentManager,getDataList())
        viewpager_main.adapter = fragmentAdapter
        tabs_main.setupWithViewPager(viewpager_main)

        tv_back.setOnClickListener(this)
    }
    fun getDataList():ArrayList<FragmentModel>{
        val list:ArrayList<FragmentModel> = ArrayList<FragmentModel>()
        //One
        val fragmentModel1 = FragmentModel()
        fragmentModel1.name = getString(R.string.fastfood)
        fragmentModel1.fragment = ShopHomeFragment()
        list.add(fragmentModel1)

        //Two
        val fragmentModel2 = FragmentModel()
        fragmentModel2.name = getString(R.string.restaurants)
        fragmentModel2.fragment = ShopHomeFragment()
        list.add(fragmentModel2)

        //One
        val fragmentModel3 = FragmentModel()
        fragmentModel3.name = getString(R.string.healthy)
        fragmentModel3.fragment = ShopHomeFragment()
        list.add(fragmentModel3)

        //One
        val fragmentModel4 = FragmentModel()
        fragmentModel4.name = getString(R.string.desert)
        fragmentModel4.fragment = ShopHomeFragment()
        list.add(fragmentModel4)

        //One
        val fragmentModel5 = FragmentModel()
        fragmentModel5.name = getString(R.string.drinks)
        fragmentModel5.fragment = ShopHomeFragment()
        list.add(fragmentModel5)

        //One
        val fragmentModel6 = FragmentModel()
        fragmentModel6.name = getString(R.string.pizzas)
        fragmentModel6.fragment = ShopHomeFragment()
        list.add(fragmentModel6)

        //One
        val fragmentModel7 = FragmentModel()
        fragmentModel7.name = getString(R.string.burger)
        fragmentModel7.fragment = ShopHomeFragment()
        list.add(fragmentModel7)

        //One
        val fragmentModel8 = FragmentModel()
        fragmentModel8.name = getString(R.string.namkeens)
        fragmentModel8.fragment = ShopHomeFragment()
        list.add(fragmentModel8)

        return list
    }

    override fun onClick(v: View?) {
        super.onClick(v)
        when(v!!.id){
            R.id.tv_back -> {
                MainActivity.getInstance().showExitAlert()
            }
        }
    }
}