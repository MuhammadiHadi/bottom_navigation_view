package com.example.bottom_navigation_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bottom_navigation_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
      binding.bottomNavigation.setOnItemSelectedListener {

     replaceFragement(home())
          when(it.itemId){
              R.id.home->replaceFragement(home())
              R.id.chat->replaceFragement(Chat())
              R.id.person->replaceFragement(Person())
              else->{

              }
          }

          true
      }
    }

   fun replaceFragement(Fragment: Fragment){
       val fragmentTransaction=supportFragmentManager.beginTransaction()
       fragmentTransaction.replace(R.id.framelayout,Fragment)
       fragmentTransaction.commit()

    }
}