package com.example.bottom_navigation_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Product :Fragment() {
 lateinit  var product:View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    product= inflater.inflate(R.layout.product_fragment,container,false)

        return  product
    }
}