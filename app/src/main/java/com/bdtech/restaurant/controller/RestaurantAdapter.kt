package com.bdtech.restaurant.controller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bdtech.restaurant.R
import com.bdtech.restaurant.view.activity.MainActivity
import com.bdtech.restaurant.view.fragment.MenuFragment
import kotlinx.android.synthetic.main.item_restaurant.view.*

class RestaurantAdapter(val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_restaurant, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ll_main.setOnClickListener(View.OnClickListener {
            MainActivity.getInstance().replaceFragment(MenuFragment())
        })
    }
    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return 3
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val ll_main = view.ll_main
}