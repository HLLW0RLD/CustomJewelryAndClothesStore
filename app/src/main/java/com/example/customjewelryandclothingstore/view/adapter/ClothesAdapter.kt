package com.example.customjewelryandclothingstore.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.customjewelryandclothingstore.R
import com.example.customjewelryandclothingstore.data.Clothes
import com.example.customjewelryandclothingstore.data.Jewelry
import com.example.customjewelryandclothingstore.data.Shoppers

class ClothesAdapter : RecyclerView.Adapter<ClothesAdapter.MainViewHolder>() {

    private var clothes : MutableList<Clothes> = mutableListOf()

    fun setClothes(products : MutableList<Clothes>){
        this.clothes = products
        notifyDataSetChanged()
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.imageViewList)

        private val name = itemView.findViewById<TextView>(R.id.textViewList)

        private val price = itemView.findViewById<TextView>(R.id.priceViewList)

        fun bind(product: Clothes) {
//            Glide
//                .with(itemView)
//                .load(product.image)
//                .into(image)

            name.text = product.name

            price.text = product.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemView : View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MainViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(clothes[position])
    }

    override fun getItemCount(): Int {
        return clothes.size
    }
}