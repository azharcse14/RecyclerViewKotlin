package com.azhar.recyclerviewkotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.azhar.recyclerviewkotlin.DataClass.ItemsViewModel
import com.azhar.recyclerviewkotlin.R

class RvAdapter(private val mList: List<ItemsViewModel>): RecyclerView.Adapter<RvViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_layout, parent, false)

        return RvViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(mList.get(position).image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}