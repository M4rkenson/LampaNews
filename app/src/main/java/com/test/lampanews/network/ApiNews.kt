package com.test.lampanews.network

import com.test.lampanews.models.News
import retrofit2.http.GET

interface ApiNews {
    @GET(" ")
    suspend fun getNews(
    ): List<News>
}