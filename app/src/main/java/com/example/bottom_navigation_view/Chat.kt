package com.example.bottom_navigation_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class Chat :Fragment() {
     var  Chatview=view

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Chatview= inflater.inflate(R.layout.chat_fragment,container,false)
        var name= arrayOf("hadi","khan","zia khan","amir","babar ali","android","kotlin","java","flutter")
        var arrayAdapter= ArrayAdapter(
            requireContext(),android.R.layout.simple_list_item_1,name)
        var listview=Chatview?.findViewById<ListView>(R.id.listview)
        listview?.adapter = arrayAdapter

        return  Chatview
    }
}