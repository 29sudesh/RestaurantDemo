package com.bdtech.restaurant.model

import androidx.fragment.app.Fragment
import java.io.Serializable

class FragmentModel : Serializable{
    var name : String= ""
    var fragment : Fragment ? = null
}