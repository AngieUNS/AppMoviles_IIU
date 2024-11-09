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
 * Use the [PrimeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_prime, container, false)

        val numberInput = view.findViewById<EditText>(R.id.numberInput)
        val checkPrimeButton = view.findViewById<Button>(R.id.checkPrimeButton)
        val primeResultView = view.findViewById<TextView>(R.id.primeResultView)

        checkPrimeButton.setOnClickListener {
            val num = numberInput.text.toString().toIntOrNull() ?: 0
            val isPrime = isPrime(num)
            primeResultView.text = if (isPrime) "$num es primo" else "$num no es primo"
        }

        return view
    }

    private fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) return false
        }
        return true
    }
}
