package com.niked4chiba.my_twitter_client.component.tweet_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.niked4chiba.my_twitter_client.R
import com.niked4chiba.my_twitter_client.models.Tweet

class TweetViewAdapter(tweets: List<Tweet>) : RecyclerView.Adapter<TweetViewHolder>() {
    private val tweetsList = tweets

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_view, parent, false)
        val tweetViewHolder = TweetViewHolder(view)
        return tweetViewHolder
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        val tweet = tweetsList[position]
        holder.content?.text = tweet.content
    }
}