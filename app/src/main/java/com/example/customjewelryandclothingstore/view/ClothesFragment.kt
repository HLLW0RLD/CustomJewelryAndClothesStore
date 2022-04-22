package com.example.customjewelryandclothingstore.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customjewelryandclothingstore.R
import com.example.customjewelryandclothingstore.data.repository.Repository
import com.example.customjewelryandclothingstore.view.adapter.ClothesAdapter
import kotlinx.android.synthetic.main.fragment_clothes.*

class ClothesFragment : Fragment() {

    companion object {
        fun newInstance() = ClothesFragment()
    }

    val adapter = ClothesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_clothes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        product_list.adapter = adapter

        adapter.setClothes(Repository.getClothes())

        product_list.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

}