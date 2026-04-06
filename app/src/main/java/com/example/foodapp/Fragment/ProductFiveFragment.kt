package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentProductFourBinding
import com.example.foodapp.databinding.FragmentProductOneBinding


class ProductFiveFragment : Fragment(R.layout.fragment_product_five) {

    private var _binding: FragmentProductFourBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backIV1 = view.findViewById<ImageView>(R.id.backIV1)
        backIV1.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}