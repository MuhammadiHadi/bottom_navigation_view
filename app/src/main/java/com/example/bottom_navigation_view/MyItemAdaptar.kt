package com.example.bottom_navigation_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyItemAdaptar(var newsList:ArrayList<Item>): RecyclerView.Adapter<MyItemAdaptar.MyViewHodler>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHodler {
        val itemview=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return  MyViewHodler(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHodler, position: Int) {
     val currentItem=newsList[position]
        holder.imageview.setImageResource(currentItem.image)
        holder.title.text=currentItem.title
    }

    override fun getItemCount(): Int {
        return  newsList.size
    }
    class MyViewHodler(itemview: View):RecyclerView.ViewHolder(itemview){

        val imageview:ImageView=itemview.findViewById<ImageView>(R.id.imageView)
        val title:TextView=itemview.findViewById<TextView>(R.id.itemText)

    }

}