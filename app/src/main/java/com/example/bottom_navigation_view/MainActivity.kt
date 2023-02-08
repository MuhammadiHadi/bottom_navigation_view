package com.example.bottom_navigation_view

import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.bottom_navigation_view.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout.TabGravity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        replaceFragement(Home())
      binding.bottomNavigation.setOnItemSelectedListener {


          when(it.itemId){
              R.id.home->replaceFragement(Home())
              R.id.chat->replaceFragement(Chat())
              R.id.product->replaceFragement(Product())
              R.id.person->replaceFragement(Person())
              else->{

              }
          }

          true
      }





        GlobalScope.launch(Dispatchers.Main) {

            Log.d(TAG ,"hadi${Thread.currentThread().name}")
        }


    }

   fun replaceFragement(Fragment: Fragment){
       val fragmentTransaction=supportFragmentManager.beginTransaction()
       fragmentTransaction.replace(R.id.framelayout,Fragment)
       fragmentTransaction.commit()

    }
}