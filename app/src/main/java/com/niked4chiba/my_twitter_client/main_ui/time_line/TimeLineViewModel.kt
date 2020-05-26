package com.niked4chiba.my_twitter_client.main_ui.time_line

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TimeLineViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is time line Fragment"
    }
    val text: LiveData<String> = _text
}