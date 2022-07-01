package com.jane.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter(var number_list:List<Int>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.names_list_item,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvnumbers.text=number_list.get(position).toString()
    }

    override fun getItemCount(): Int {
        return  number_list.size
    }
}
class NumbersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvnumbers=itemView.findViewById<TextView>(R.id.tvnumbers)
}