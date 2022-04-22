package com.example.customjewelryandclothesstore.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.customjewelryandclothesstore.R
import com.example.customjewelryandclothesstore.data.Shoppers

class ShoppersAdapter : RecyclerView.Adapter<ShoppersAdapter.MainViewHolder>() {

    private var shoppers : MutableList<Shoppers> = mutableListOf()

    fun setShoppers(products : MutableList<Shoppers>){
        this.shoppers = products
        notifyDataSetChanged()
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.imageViewList)

        private val name = itemView.findViewById<TextView>(R.id.textViewList)

        private val price = itemView.findViewById<TextView>(R.id.priceViewList)

        fun bind(product: Shoppers) {
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
        holder.bind(shoppers[position])
    }

    override fun getItemCount(): Int {
        return shoppers.size
    }
}