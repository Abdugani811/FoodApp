package com.example.foodapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentProductOneBinding
import com.example.foodapp.databinding.FragmentProductTwoBinding

class ProductTwoFragment : Fragment(R.layout.fragment_product_two) {

    private var _binding: FragmentProductTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button6.setOnClickListener {
            findNavController().navigate(com.example.foodapp.R.id.action_ProductTwoFragment_to_PaymentFragment)
        }

        val backIV5 = view.findViewById<ImageView>(R.id.backIV5)
        backIV5.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}