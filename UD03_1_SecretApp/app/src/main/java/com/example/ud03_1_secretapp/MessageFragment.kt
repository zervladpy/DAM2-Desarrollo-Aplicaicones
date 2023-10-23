package com.example.ud03_1_secretapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)

        val button = view.findViewById<Button>(R.id.button_nect)

        button.setOnClickListener {
            val editText = view.findViewById<EditText>(R.id.edit_text).text.toString()
            val actions = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(editText)

            view.findNavController().navigate(actions)
        }

        return view
    }
}