package com.bdtech.restaurant.view.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.bdtech.restaurant.R
import com.bdtech.restaurant.view.fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivity = this
        addFragment(HomeFragment())
        tv_home.setOnClickListener(this)
        tv_shop.setOnClickListener(this)
        tv_food.setOnClickListener(this)
        tv_super_market.setOnClickListener(this)
        tv_super_market.setOnClickListener(this)
        tv_custom_order.setOnClickListener(this)
        tv_jobs.setOnClickListener(this)
    }

    companion object{
        var mainActivity:MainActivity? =null
        fun getInstance():MainActivity{
            return mainActivity!!
        }
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.tv_home -> {
                replaceFragment(HomeFragment())
            }
            R.id.tv_shop -> {
                replaceFragment(HomeFragment())
            }
            R.id.tv_food -> {
                replaceFragment(MenuFragment())
            }
            R.id.tv_super_market -> {
                replaceFragment(MenuFragment())
            }
            R.id.tv_custom_order -> {
                replaceFragment(CustomOrderFragment())
            }
            R.id.tv_jobs -> {
                replaceFragment(JobsFragment())
            }
        }
    }


    fun addFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().add(R.id.container_main,fragment,fragment::class.java.simpleName).commit()
    }

    fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container_main,fragment,fragment::class.java.simpleName).commit()
    }

    fun showExitAlert(){
        // build alert dialog
        val dialogBuilder = AlertDialog.Builder(this)

        // set message of alert dialog
        dialogBuilder.setMessage("Do you want to close this application ?")
            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                    dialog, id -> finish()
            })
            // negative button text and action
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("AlertDialogExample")
        // show alert dialog
        alert.show()
    }
}
