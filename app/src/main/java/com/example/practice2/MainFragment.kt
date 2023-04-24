package com.example.practice2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practice2.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
//  Layout inflater approach:
//
//        val view = inflater.inflate(R.layout.fragment_main, container, false)
//        val button = view.findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            Toast.makeText(requireContext(), "You clicked a button!", Toast.LENGTH_LONG).show()
//        }
//        return view

        binding = FragmentMainBinding.inflate(layoutInflater)
        setUpViews()
        return binding.root
    }

    private fun setUpViews() {
        binding.button.setOnClickListener {
            Toast.makeText(requireContext(), "You clicked a button!", Toast.LENGTH_LONG).show()
        }

        binding.label.text = requireContext().getString(R.string.changed_fragment_label)
    }
}