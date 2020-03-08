package com.example.milliyetreplica.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.milliyetreplica.R
import com.example.milliyetreplica.model.BaseNewsModel
import com.example.milliyetreplica.model.NewsModel
import kotlinx.android.synthetic.main.row_item_small.view.*

class SmallNewViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.row_item_small,
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