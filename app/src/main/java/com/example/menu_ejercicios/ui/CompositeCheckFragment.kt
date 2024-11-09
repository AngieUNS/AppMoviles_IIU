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
 * Use the [CompositeCheckFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CompositeCheckFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_composite_check, container, false)

        val numberInput = view.findViewById<EditText>(R.id.numberInput)
        val checkCompositeButton = view.findViewById<Button>(R.id.checkCompositeButton)
        val compositeResultView = view.findViewById<TextView>(R.id.compositeResultView)

        checkCompositeButton.setOnClickListener {
            val number = numberInput.text.toString().toIntOrNull() ?: 0
            val isComposite = isComposite(number)
            compositeResultView.text = if (isComposite) "$number es compuesto" else "$number no es compuesto"
        }

        return view
    }

    private fun isComposite(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2 until number) {
            if (number % i == 0) {
                return true
            }
        }
        return false
    }
}
