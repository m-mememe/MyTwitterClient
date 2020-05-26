package com.niked4chiba.my_twitter_client.main_ui.direct_message

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.niked4chiba.my_twitter_client.R
import com.niked4chiba.my_twitter_client.main_ui.time_line.TimeLineViewModel

class DirectMessageFragment : Fragment() {

    private lateinit var directMessageViewModel: DirectMessageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        directMessageViewModel =
            ViewModelProviders.of(this).get(DirectMessageViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_direct_message, container, false)
        val textView: TextView = root.findViewById(R.id.text_direct_message)
        directMessageViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
