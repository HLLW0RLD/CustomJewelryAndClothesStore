package com.example.customjewelryandclothingstore.view

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.customjewelryandclothingstore.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView.itemIconTintList = null

        sidemenu_icon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuClothes -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, ClothesFragment.newInstance())
                        .commitNow()
                }
                R.id.menuShoppers -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, ShoppersFragment.newInstance())
                        .commitNow()
                }
                R.id.menuJewelry -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, JewelryFragment.newInstance())
                        .commitNow()
                }
                R.id.menuCustom -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, CustomFragment.newInstance())
                        .commitNow()
                }
                R.id.menuAboutUs -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, InfoFragment.newInstance())
                        .commitNow()
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}