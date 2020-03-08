package com.example.milliyetreplica.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.milliyetreplica.R
import com.example.milliyetreplica.model.BaseNewsModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds


class AdsBannerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_ads_banner,
        parent,
        false
    )
) {
    val mAdView = itemView.findViewById<AdView>(R.id.adView)
    fun bind(
        newsModel: BaseNewsModel,
        onItemClickListener: (BaseNewsModel) -> Unit
    ) {

        MobileAds.initialize(itemView.context)
//        mAdView.adSize = AdSize.BANNER
//        mAdView.adUnitId = (newsModel as AdsModel).adUnitId
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }
}