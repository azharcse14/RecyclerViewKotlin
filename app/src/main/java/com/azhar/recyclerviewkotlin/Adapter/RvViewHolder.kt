package com.azhar.recyclerviewkotlin.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azhar.recyclerviewkotlin.R

class RvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var imageView = itemView.findViewById<ImageView>(R.id.imageView)
    var textView = itemView.findViewById<TextView>(R.id.textView)
}