package com.example.gallery

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.adapter.adapter_kt
import com.example.gallery.data.datasource
import com.example.gallery.model.gallery

class MainActivity : AppCompatActivity(),adapter_kt.Click {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val maindata = datasource().create()
        val recycle = findViewById<RecyclerView>(R.id.recycle_view)
        recycle.adapter = adapter_kt(this, maindata,this)
        recycle.setHasFixedSize(true)
    }

    override fun go_to_main(R_id: Int) {
        val data = datasource().create()
        val items=data[R_id]
        val imglist:ImageView=findViewById(R.id.screen_img)
              imglist.setImageResource(items.imageResourceId)
        val opt_icon:ImageView=findViewById(R.id.details)
              opt_icon.setImageResource(R.drawable.ic_dots)
        opt_icon.setOnClickListener {
            makeText(this,"NAME:${getString(items.name_img)}" +
                    "SIZE:${getString(items.size)}" +
                    " DATE:${getString(items.date)}", LENGTH_SHORT).show()
        }

    }
}