package com.test.lampanews.viewmodels

import androidx.lifecycle.MutableLiveData
import com.test.lampanews.models.News
import com.test.lampanews.network.Event

class ActivityViewModel : NewsViewModel() {
    val simpleLiveData = MutableLiveData<Event<List<News>>>()

    fun getNews() {
        requestWithLiveData(simpleLiveData) {
            api.getNews()
        }
    }
}