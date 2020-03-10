package com.example.milliyetreplica.holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.milliyetreplica.R
import com.example.milliyetreplica.adapter.SliderAdapter
import com.example.milliyetreplica.model.BaseNewsModel
import com.make.dots.dotsindicator.DotsIndicator


class SliderImageViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.activity_slider, parent, false
    )
) {
    val viewPager = itemView.findViewById<View>(R.id.sliderrr) as ViewPager
    val dots = itemView.findViewById<View>(R.id.dotsIndicator) as DotsIndicator

    //        val imageSlider = itemView.findViewById<ImageSlider>(R.id.image_slider)
    fun bind(newsModel: List<BaseNewsModel>) {
//        imageSlider.setImageList(newsModel)
        val adapters = SliderAdapter(itemView.context, newsModel)
        viewPager.adapter = adapters

        dots.setViewPager(viewPager)
        viewPager.adapter?.registerDataSetObserver(dots.dataSetObserver)

    }
}




