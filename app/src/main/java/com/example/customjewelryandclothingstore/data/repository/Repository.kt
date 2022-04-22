package com.example.customjewelryandclothingstore.data.repository

import com.example.customjewelryandclothingstore.data.Clothes
import com.example.customjewelryandclothingstore.data.Jewelry
import com.example.customjewelryandclothingstore.data.Shoppers

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