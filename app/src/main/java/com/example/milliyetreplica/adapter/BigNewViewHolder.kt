package com.example.milliyetreplica.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.milliyetreplica.R
import com.example.milliyetreplica.model.BaseNewsModel
import com.example.milliyetreplica.model.NewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*


class BigNewViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_big_news,
        parent,
        false
    )
) {
    fun bind(
        newsModel: BaseNewsModel,
        onItemClickListener: (BaseNewsModel) -> Unit
    ) {
        Glide.with(itemView.context)
            .load((newsModel as NewsModel).newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)

        itemView.txtNewsTitle.text = newsModel.newsTitle

        itemView.setOnClickListener {
            onItemClickListener(newsModel)
        }
    }
}