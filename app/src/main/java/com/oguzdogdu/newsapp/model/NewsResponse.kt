package com.oguzdogdu.newsapp.model

import android.os.Parcelable

@kotlinx.parcelize.Parcelize
data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
):Parcelable

