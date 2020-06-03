package com.niked4chiba.my_twitter_client.component.tweet_view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.tweet_view.view.*

class TweetViewHolder(tweetView: View) : RecyclerView.ViewHolder(tweetView) {
    var icon: CircleImageView? = null
    var userId: TextView? = null
    var name: TextView? = null
    var time: TextView? = null
    var content: TextView? = null

    init {
        icon = tweetView.icon
        userId = tweetView.user_id
        name = tweetView.name
        time = tweetView.time
        content = tweetView.content
    }
}