package com.bdtech.restaurant.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bdtech.restaurant.R
import com.bdtech.restaurant.controller.RestaurantAdapter
import kotlinx.android.synthetic.main.fragment_home_shop.*

class ShopHomeFragment : BaseFragment() {
    var myView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (myView == null) {
            myView = inflater.inflate(R.layout.fragment_home_shop, container, false)
        }

        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_data.adapter = RestaurantAdapter(context!!)
    }

    override fun onClick(v: View?) {
        super.onClick(v)
        when(v!!.id){

        }
    }
}