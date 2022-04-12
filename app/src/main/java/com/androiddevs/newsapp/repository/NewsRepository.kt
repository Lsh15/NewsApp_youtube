package com.androiddevs.newsapp.repository

import com.androiddevs.newsapp.api.RetrofitInstance
import com.androiddevs.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}