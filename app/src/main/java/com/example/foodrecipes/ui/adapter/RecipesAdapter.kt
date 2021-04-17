package com.example.foodrecipes.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodrecipes.R

class RecipesAdapter: RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {

    class MyViewHolder(item:View): RecyclerView.ViewHolder(item){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.recipes_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }
}