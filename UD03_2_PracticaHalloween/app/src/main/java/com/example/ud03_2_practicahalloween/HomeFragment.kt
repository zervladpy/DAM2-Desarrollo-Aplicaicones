package com.example.ud03_2_practicahalloween

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<Button>(R.id.continue_button).setOnClickListener {
            val name = view.findViewById<EditText>(R.id.name_textedit).text.toString()

            if (name.isNotBlank() || name.isNotEmpty()) {

                val actions = HomeFragmentDirections.actionHomeFragmentToSelectionFragment(name)

                view.findNavController().navigate(actions)
            }

        }

        return view
    }
}