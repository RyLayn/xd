package com.angel.xd

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MoviesAdapter(private val list: List<String>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    class ViewHolder(itemViewHolder: View) : RecyclerView.ViewHolder(itemViewHolder) {
        val movieImage:ImageView = itemViewHolder.findViewById(R.id.movieimg)
        val movieName:TextView = itemViewHolder.findViewById(R.id.moviename)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesAdapter.ViewHolder, position: Int) {
        val itemViewHolder = list [position]
        holder.movieName.text = itemViewHolder
    }

    override fun getItemCount(): Int {
        return list.size
    }
}