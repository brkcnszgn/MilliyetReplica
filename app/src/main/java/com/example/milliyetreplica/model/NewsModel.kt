package com.example.milliyetreplica.model

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    override val itemViewType: Int
) : BaseNewsModel()