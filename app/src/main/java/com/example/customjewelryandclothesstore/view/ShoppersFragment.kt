package com.example.customjewelryandclothesstore.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customjewelryandclothesstore.R
import com.example.customjewelryandclothesstore.data.repository.Repository
import com.example.customjewelryandclothesstore.view.adapter.ShoppersAdapter
import kotlinx.android.synthetic.main.fragment_clothes.*

class ShoppersFragment : Fragment() {

    companion object {
        fun newInstance() = ShoppersFragment()
    }

    val adapter = ShoppersAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shoppers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        product_list.adapter = adapter

        adapter.setShoppers(Repository.getShoppers())

        product_list.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

}