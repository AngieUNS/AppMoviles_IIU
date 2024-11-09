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
 * Use the [WallConstructionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WallConstructionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_wall_construction, container, false)

        val workersInput = view.findViewById<EditText>(R.id.workersInput)
        val daysInput = view.findViewById<EditText>(R.id.daysInput)
        val calculateButton = view.findViewById<Button>(R.id.calculateButton)
        val resultView = view.findViewById<TextView>(R.id.resultView)

        calculateButton.setOnClickListener {
            val workers = workersInput.text.toString().toIntOrNull() ?: 0
            val initialDays = daysInput.text.toString().toIntOrNull() ?: 0
            val result = calculateDays(workers, initialDays)
            resultView.text = "Se necesitarán $result días para $workers trabajadores."
        }

        return view
    }

    private fun calculateDays(workers: Int, initialDays: Int): Int {
        // Sabemos que 4 trabajadores pueden hacerlo en 6 días.
        val workersRatio = 4.0 / workers
        val daysNeeded = initialDays * workersRatio
        return daysNeeded.toInt()
    }
}
