package com.niked4chiba.my_twitter_client.main_ui.time_line

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niked4chiba.my_twitter_client.R
import com.niked4chiba.my_twitter_client.component.tweet_view.TweetViewAdapter
import com.niked4chiba.my_twitter_client.models.Tweet

class TimeLineFragment : Fragment() {

    private lateinit var timeLineViewModel: TimeLineViewModel
    private lateinit var adapter: TweetViewAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private val tweets: List<Tweet> = listOf(
        Tweet("come"),
        Tweet("on"),
        Tweet("yjm"),
        Tweet("if"),
        Tweet("you"),
        Tweet("can"),
        Tweet(","),
        Tweet("but"),
        Tweet("if"),
        Tweet("you"),
        Tweet("can"),
        Tweet("do"),
        Tweet("it"),
        Tweet(","),
        Tweet("i"),
        Tweet("was"),
        Tweet("disappointed"),
        Tweet("with"),
        Tweet("you")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        timeLineViewModel =
            ViewModelProviders.of(this).get(TimeLineViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_time_line, container, false)
        val tweetView: RecyclerView = root.findViewById(R.id.tweet_view)
        val itemDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        tweetView.addItemDecoration(itemDecoration)
        timeLineViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        layoutManager = LinearLayoutManager(context)
        adapter = TweetViewAdapter(tweets)
        tweetView.layoutManager = layoutManager
        tweetView.adapter = adapter

        return root
    }
}
