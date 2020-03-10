package com.example.milliyetreplica.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.example.milliyetreplica.R
import com.example.milliyetreplica.model.BaseNewsModel
import com.example.milliyetreplica.model.ImageModel


class SliderAdapter(private val context: Context, var imageList: List<BaseNewsModel>) :
    PagerAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private val images = arrayOf(R.drawable.placeholder, R.drawable.ic_launcher_background)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int =
        imageList.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.row_item_slider, null)
        val image = v.findViewById<View>(R.id.imageViews) as ImageView
//        image.setImageResource(imageList[position])
        Glide.with(context).load((imageList[position] as ImageModel).imageUrl).centerCrop()
            .into(image)
        val vp = container as ViewPager
        vp.addView(v, 0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//        super.destroyItem(container, position, `object`)
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)

    }
}