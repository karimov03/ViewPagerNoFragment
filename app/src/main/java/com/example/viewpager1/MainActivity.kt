package com.example.viewpager1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.example.viewpager1.Adapters.Adapter
import com.example.viewpager1.databinding.ActivityMainBinding
import com.example.viewpager1.databinding.ItemtabBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        MyData.Addlist()
        adapter = Adapter(MyData.list)
        binding.viewpager.adapter = adapter

        binding.tabLayout.setupWithViewPager(binding.viewpager)

        val tabCount = binding.tabLayout.tabCount


        for (i in 0 until tabCount) {
            val tabItem = ItemtabBinding.inflate(layoutInflater)
            val tab = binding.tabLayout.getTabAt(i)
            tab?.customView = tabItem.root

            if (i == 0) {
                tabItem.tabImage.setImageResource(R.drawable.tab_full)
            } else {
                tabItem.tabImage.setImageResource(R.drawable.tab_empty)

        }

        var index = 0
        binding.viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {
                index = position
            }

            override fun onPageSelected(position: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        binding.btnNext.setOnClickListener {
            when (index) {
                0 -> {
                    binding.viewpager.currentItem = index + 1
                }
                1 -> {
                    binding.viewpager.currentItem = index + 1

                }
                2 -> {
                    binding.viewpager.currentItem = index + 1

                }
                3 -> {
                    binding.viewpager.currentItem = index - 3

                }
            }
        }

        val binding1 = ItemtabBinding.inflate(layoutInflater)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding1.tabImage.setImageResource(R.drawable.tab_full)
                val customView = tab?.customView
                customView?.findViewById<ImageView>(R.id.tab_image)
                    ?.setImageResource(R.drawable.tab_full)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

                val customView = tab?.customView
                customView?.findViewById<ImageView>(R.id.tab_image)
                    ?.setImageResource(R.drawable.tab_empty)
            }


            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })


    }
}}