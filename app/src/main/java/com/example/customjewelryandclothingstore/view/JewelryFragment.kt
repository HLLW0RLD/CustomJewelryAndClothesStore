package com.example.customjewelryandclothingstore.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customjewelryandclothingstore.R
import com.example.customjewelryandclothingstore.data.Jewelry
import com.example.customjewelryandclothingstore.data.repository.Repository
import com.example.customjewelryandclothingstore.view.adapter.ClothesAdapter
import com.example.customjewelryandclothingstore.view.adapter.JewelryAdapter
import kotlinx.android.synthetic.main.fragment_clothes.*
import kotlinx.android.synthetic.main.fragment_clothes.product_list
import kotlinx.android.synthetic.main.fragment_jewelry.*

private const val BEADS : String = "Бусы"
private const val BRACELETS : String = "Браслет"
private const val EARRING : String = "Сережки"
private const val BROOCHES : String = "Брошь"

class JewelryFragment : Fragment() {

    companion object {
        fun newInstance() = JewelryFragment()
    }

    val adapter = JewelryAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_jewelry, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        product_list.adapter = adapter

        adapter.setJewelry(Repository.getJewelry())

        product_list.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        chip_all.setOnCheckedChangeListener { compoundButton, b ->
            adapter.setJewelry(Repository.getJewelry())
        }

        chip_beads.setOnCheckedChangeListener { compoundButton, b ->
            val beads : MutableList<Jewelry> = mutableListOf()

            for (i : Jewelry in Repository.getJewelry()){
                if (i.name.contains(BEADS)){
                    beads.add(i)
                }
            }
            adapter.setJewelry(beads)
        }

        chip_bracelets.setOnCheckedChangeListener { compoundButton, b ->
            val bracelets : MutableList<Jewelry> = mutableListOf()

            for (i : Jewelry in Repository.getJewelry()){
                if (i.name.contains(BRACELETS)){
                    bracelets.add(i)
                }
            }
            adapter.setJewelry(bracelets)
        }

        chip_earrings.setOnCheckedChangeListener { compoundButton, b ->
            val earrings : MutableList<Jewelry> = mutableListOf()

            for (i : Jewelry in Repository.getJewelry()){
                if (i.name.contains(EARRING)){
                    earrings.add(i)
                }
            }
            adapter.setJewelry(earrings)
        }

        chip_brooches.setOnCheckedChangeListener { compoundButton, b ->
            val brooches : MutableList<Jewelry> = mutableListOf()

            for (i : Jewelry in Repository.getJewelry()){
                if (i.name.contains(BROOCHES)){
                    brooches.add(i)
                }
            }
            adapter.setJewelry(brooches)
        }
    }
}