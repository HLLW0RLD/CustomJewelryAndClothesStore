package com.example.customjewelryandclothesstore.data.repository

import com.example.customjewelryandclothesstore.data.Clothes
import com.example.customjewelryandclothesstore.data.Jewelry
import com.example.customjewelryandclothesstore.data.Shoppers

object Repository {

    fun getClothes() = mutableListOf<Clothes>(
        Clothes("Product", 500),
        Clothes("Product", 500),
        Clothes("Product", 500),
        Clothes("Product", 500),
        Clothes("Product", 500),
        Clothes("Product", 500),
        Clothes("Product", 500),
        Clothes("Product", 500)
    )

    fun getShoppers() = mutableListOf<Shoppers>(
        Shoppers("Product", 500),
        Shoppers("Product", 500),
        Shoppers("Product", 500),
        Shoppers("Product", 500),
        Shoppers("Product", 500),
        Shoppers("Product", 500),
        Shoppers("Product", 500),
        Shoppers("Product", 500)
    )

    fun getJewelry() = mutableListOf<Jewelry>(
        Jewelry("Браслет", 500),
        Jewelry("Бусы", 500),
        Jewelry("Сережки", 500),
        Jewelry("Брошь", 500),
        Jewelry("Браслет", 500),
        Jewelry("Бусы", 500),
        Jewelry("Сережки", 500),
        Jewelry("Брошь", 500),
        Jewelry("Браслет", 500),
        Jewelry("Бусы", 500),
        Jewelry("Сережки", 500),
        Jewelry("Браслет", 500),
        Jewelry("Бусы", 500),
        Jewelry("Сережки", 500),
        Jewelry("Брошь", 500),
    )

}