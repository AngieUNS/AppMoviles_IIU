package com.example.menu_ejercicios.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.menu_ejercicios.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FactorsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FactorsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_factors, container, false)

        val calculateButton = view.findViewById<Button>(R.id.calculateButton)
        val factorsListView = view.findViewById<TextView>(R.id.factorsListView)
        val compositeResultView = view.findViewById<TextView>(R.id.compositeResultView)

        calculateButton.setOnClickListener {
            val factors = getFactors(60)
            factorsListView.text = "Factores de 60: ${factors.joinToString(", ")}"
            val isComposite = isComposite(60)
            compositeResultView.text = if (isComposite) {
                "60 es un número compuesto"
            } else {
                "60 no es un número compuesto"
            }
        }

        return view
    }

    private fun getFactors(number: Int): List<Int> {
        val factors = mutableListOf<Int>()
        for (i in 1..number) {
            if (number % i == 0) {
                factors.add(i)
            }
        }
        return factors
    }

    private fun isComposite(number: Int): Boolean {
        val factors = getFactors(number)
        return factors.size > 2 // Si tiene más de 2 factores, es compuesto
    }
}
