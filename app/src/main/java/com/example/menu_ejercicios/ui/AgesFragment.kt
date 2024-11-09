package com.example.menu_ejercicios.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.menu_ejercicios.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AgesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AgesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ages, container, false)

        val anaAgeInput = view.findViewById<EditText>(R.id.anaAgeInput)
        val calculateAgesButton = view.findViewById<Button>(R.id.calculateAgesButton)
        val agesResultView = view.findViewById<TextView>(R.id.agesResultView)

        calculateAgesButton.setOnClickListener {
            val anaAge = anaAgeInput.text.toString().toIntOrNull() ?: 0
            val juanAge = anaAge - 5
            agesResultView.text = "Ana tiene $anaAge años y Juan tiene $juanAge años"
        }

        return view
    }
}
