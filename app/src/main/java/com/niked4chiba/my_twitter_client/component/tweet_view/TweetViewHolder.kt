package com.niked4chiba.my_twitter_client.component.tweet_view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tweet_view.view.*

class TweetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var content: TextView? = null
    init {
        content = itemView.content
    }
}