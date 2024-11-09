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
 * Use the [TriangleAreaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TriangleAreaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_triangle_area, container, false)

        val baseInput = view.findViewById<EditText>(R.id.baseInput)
        val heightInput = view.findViewById<EditText>(R.id.heightInput)
        val calculateAreaButton = view.findViewById<Button>(R.id.calculateAreaButton)
        val areaResultView = view.findViewById<TextView>(R.id.areaResultView)

        calculateAreaButton.setOnClickListener {
            val base = baseInput.text.toString().toDoubleOrNull() ?: 0.0
            val height = heightInput.text.toString().toDoubleOrNull() ?: 0.0
            val area = (base * height) / 2
            areaResultView.text = "Área: $area"
        }

        return view
    }
}
