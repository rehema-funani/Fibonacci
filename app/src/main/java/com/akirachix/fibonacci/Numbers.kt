package com.akirachix.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Numbers (var fibonaccilist:List<Int>):RecyclerView.Adapter<FibonacciHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonaci_text_view,parent,false)
        return  FibonacciHolder(itemView)

    }

    override fun onBindViewHolder(holder: FibonacciHolder, position: Int) {
        holder.tvNumber.text = fibonaccilist[position].toString()

    }

    override fun getItemCount(): Int {
        return fibonaccilist.size


    }
}
class FibonacciHolder(itemView: View):ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)

}