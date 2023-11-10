package com.example.ud03_2_practicahalloween

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class StoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_story, container, false)

        view.findViewById<TextView>(R.id.story_title).text

        view.findViewById<ImageView>(R.id.story_image)

        view.findViewById<TextView>(R.id.story_text)

        return view
    }

}