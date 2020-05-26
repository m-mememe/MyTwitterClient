package com.niked4chiba.my_twitter_client.main_ui.time_line

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.niked4chiba.my_twitter_client.R

class TimeLineFragment : Fragment() {

    private lateinit var timeLineViewModel: TimeLineViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        timeLineViewModel =
            ViewModelProviders.of(this).get(TimeLineViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_time_line, container, false)
        val textView: TextView = root.findViewById(R.id.text_time_line)
        timeLineViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
