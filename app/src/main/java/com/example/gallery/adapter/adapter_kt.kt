package com.example.gallery.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.R
import com.example.gallery.model.gallery

class adapter_kt(
        private val context: Context,
        private val dataset: List<gallery>,
        private val int :Click
) : RecyclerView.Adapter<adapter_kt.itemViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout, parent, false)
        return itemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView.setOnClickListener{
        int.go_to_main(position)
        }
    }


    override fun getItemCount(): Int {
        return dataset.size
    }
    inner class itemViewHolder( adapterLayout: View) :
            RecyclerView.ViewHolder(adapterLayout)
    {
        val imageView: ImageView = adapterLayout.findViewById(R.id.item_image)

    }
interface Click{
    fun go_to_main(R_id : Int)}
}