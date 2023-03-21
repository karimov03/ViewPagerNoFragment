package com.example.viewpager1.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager1.MyData
import com.example.viewpager1.databinding.ItemviewpagerBinding

class Adapter(val list: ArrayList<MyData.Text>):PagerAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemPagerBinding =
            ItemviewpagerBinding.inflate(LayoutInflater.from(container.context), container, false)
        itemPagerBinding.bacroundLayout.setBackgroundResource(list[position].backeound)
        itemPagerBinding.tvName.text = list[position].name
        itemPagerBinding.tvAbout.text = list[position].about
        container.addView(itemPagerBinding.root)
        return itemPagerBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}