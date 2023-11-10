package com.example.ud03_2_practicahalloween

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class SelectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_selection, container, false)

        // sacar de los atributos
        val name = SelectionFragmentArgs.fromBundle(requireArguments()).characterName

        // home card
        view.findViewById<CardView>(R.id.card_casa).setOnClickListener {

            val storyName = it.findViewById<TextView>(R.id.card_casa_title).text.toString()

            val actions = SelectionFragmentDirections.actionSelectionFragmentToStoryFragment(
                name, R.id.card_casa_image , storyName
            )



        }


        // forest card

        return view
    }

}