package com.example.milliyetreplica.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.milliyetreplica.enums.NewsType
import com.example.milliyetreplica.holder.AdsBannerViewHolder
import com.example.milliyetreplica.holder.SliderImageViewHolder
import com.example.milliyetreplica.holder.SmallNewViewHolder
import com.example.milliyetreplica.model.BaseNewsModel
import com.example.milliyetreplica.model.ImageModel

class NewsListAdapter(
    private val newList: List<BaseNewsModel>,
    private val sliderList: List<ImageModel>,
    private val onItemClickListener: (BaseNewsModel) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            NewsType.SLIDER.id -> {
                SliderImageViewHolder(parent)
            }
            NewsType.SMALL_NEWS.id -> {
                SmallNewViewHolder(parent)
            }
            NewsType.BIG_NEWS.id -> {
                BigNewViewHolder(parent)
            }
            NewsType.ADS_BANNER.id -> {
                AdsBannerViewHolder(parent)
            }

            else -> {
                BigNewViewHolder(parent)
            }
        }
    }


    override fun getItemCount(): Int {
        return newList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (newList[position].itemViewType) {
            NewsType.SLIDER.id -> {
                (holder as SliderImageViewHolder).bind(sliderList)
            }
            NewsType.SMALL_NEWS.id -> {
                (holder as SmallNewViewHolder).bind(newList[position], onItemClickListener)
            }
            NewsType.BIG_NEWS.id -> {
                (holder as BigNewViewHolder).bind(newList[position], onItemClickListener)
            }
            NewsType.ADS_BANNER.id -> {
                (holder as AdsBannerViewHolder).bind(newList[position], onItemClickListener)
            }

            else -> {
                (holder as BigNewViewHolder).bind(newList[position], onItemClickListener)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return newList.get(position).itemViewType
    }
}