package com.example.bottom_navigation_view

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayout.TabGravity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class Home : Fragment() {
   lateinit var  myView: View
    var x: Int = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ):
            View? {
        myView = inflater.inflate(R.layout.home_fragment, container, false)
        val text = myView?.findViewById<TextView>(R.id.textView3)

        val button = myView?.findViewById<Button>(R.id.button)
        val bottomsheet=myView?.findViewById<Button>(R.id.bottomsheet)
        val closebutton=myView?.findViewById<Button>(R.id.close)


        button?.setOnClickListener {

            println("Hello word")
            text?.setText(x.toString())

//            GlobalScope.launch(Dispatchers.Main) {
//                x++;
//                Log.d(ContentValues.TAG,"hadi ${Thread.currentThread().name}")
//            }
             GlobalScope.launch(Dispatchers.Main) {
                x++;
                Log.d(ContentValues.TAG,"hadi ${Thread.currentThread().name}")
                 Hadi()

            }
            GlobalScope.launch(Dispatchers.Main) {
                x++;
                Log.d(ContentValues.TAG,"khan ${Thread.currentThread().name}")
                khan()

            }
            GlobalScope.launch(Dispatchers.Main) {
                x++;
                Log.d(ContentValues.TAG,"coder ${Thread.currentThread().name}")
                coder()

            }

        }
        //bottom sheet code
        bottomsheet?.setOnClickListener {

            println("bottom sheet")
            val dialog= BottomSheetDialog(myView.context)
            val view=layoutInflater.inflate(R.layout.bottom_sheet,null)
            val closebutton=view.findViewById<Button>(R.id.close)
            closebutton?.setOnClickListener {
                dialog.dismiss()

            }
            dialog.setContentView(view)
            dialog.show()
            dialog.setCancelable(false)
        }

        return myView
    }


  suspend  fun Hadi(){
        Log.d(TAG,"Starting task 1")
        yield()
        Log.d(TAG,"ending task 1")
    }
  suspend  fun khan(){
        Log.d(TAG,"Starting task 2")
        yield()
        Log.d(TAG,"ending task 2")


    }
    suspend  fun coder(){
        Log.d(TAG,"Starting task 3")
        yield()
        Log.d(TAG,"ending task 3")


    }



}