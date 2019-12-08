package com.bdtech.restaurant.controller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bdtech.restaurant.R
import com.bdtech.restaurant.view.activity.MainActivity
import com.bdtech.restaurant.view.fragment.HomeFragment
import com.bdtech.restaurant.view.fragment.MenuDetailFragment
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter(val context: Context) : RecyclerView.Adapter<MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false))
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.ll_main.setOnClickListener(View.OnClickListener {
            MainActivity.getInstance().replaceFragment(MenuDetailFragment())
        })

    }
    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return 4
    }
}

class MenuViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    // Holds the TextView that will add each animal to
    val ll_main = view.ll_main
}