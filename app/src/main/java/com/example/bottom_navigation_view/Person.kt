package com.example.bottom_navigation_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar




class Person :Fragment() {
   lateinit var  person:View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        person=inflater.inflate(R.layout.person_fragment,container,false)



        val login=person?.findViewById<Button>(R.id.login_button)
        login?.setOnClickListener {

            val snackbar = Snackbar.make(person, "Enter Email Password", Snackbar.LENGTH_LONG)
            snackbar.setAction("OKAY") {
                // Do appropriate action on click of snackbar action button
            }
            snackbar.show()
        }


        return  person
    }
}