package com.example.customjewelryandclothingstore.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.customjewelryandclothingstore.R
import com.example.customjewelryandclothingstore.data.Clothes
import com.example.customjewelryandclothingstore.data.Jewelry

class JewelryAdapter : RecyclerView.Adapter<JewelryAdapter.MainViewHolder>() {

    private var jewelry : MutableList<Jewelry> = mutableListOf()

    fun setJewelry(products : MutableList<Jewelry>){
        this.jewelry = products
        notifyDataSetChanged()
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.imageViewList)

        private val name = itemView.findViewById<TextView>(R.id.textViewList)

        private val price = itemView.findViewById<TextView>(R.id.priceViewList)

        fun bind(product: Jewelry) {
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
        holder.bind(jewelry[position])
    }

    override fun getItemCount(): Int {
        return jewelry.size
    }
}