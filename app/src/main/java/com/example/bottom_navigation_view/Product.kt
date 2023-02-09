package com.example.bottom_navigation_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Product :Fragment() {
 lateinit  var product:View
 lateinit var recycleview:RecyclerView
 lateinit var newslist:ArrayList<Item>
 lateinit var texttiel:Array<String>
 lateinit var image:Array<Int>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    product= inflater.inflate(R.layout.product_fragment,container,false)
        recycleview= product?.findViewById(R.id.recycleview)!!


        texttiel= arrayOf(
            "coopritve funcation",
            " its mean that diffenent task cooprtvie with each",
            "other and complete task",
            " corputines we execute mutiple coroutine in one thread.",
            "kotlin coroutine help us to write asyncornse code",
            "asyncoronce mean task execute parallal",
            "asyncoronce mean task execute parallal",
            "asyncoronce mean task execute parallal",
            "asyncoronce mean task execute parallal",
            "asyncoronce mean task execute parallal",
        )

        image= arrayOf(
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,
            R.drawable.hadi,


        )
        recycleview.layoutManager=LinearLayoutManager(product.context)

        recycleview.setHasFixedSize(true)
        newslist= arrayListOf<Item>()
        getData()


        return  product
    }
    fun getData(){
        for(i in image .indices){

            val news= Item(image[i],texttiel[i])
            newslist.add(news)
        }
        recycleview.adapter=MyItemAdaptar(newslist)
    }
}