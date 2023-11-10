package com.example.ud05_1_pizza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)

        (activity as AppCompatActivity).setSupportActionBar(toolbar)


        val pizzaGroup = view.findViewById<RadioGroup>(R.id.radio_selection)
        val pizzaType = pizzaGroup.checkedRadioButtonId

        var msg = ""

        if (pizzaType == -1) {
            msg = "Debes seleccionar un tipo de pizza"
        }

        return view;
    }

}