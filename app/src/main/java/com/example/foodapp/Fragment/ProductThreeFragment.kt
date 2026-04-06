package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentProductOneBinding
import com.example.foodapp.databinding.FragmentProductThreeBinding


class ProductThreeFragment : Fragment(R.layout.fragment_product_three) {

    private var _binding: FragmentProductThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button8.setOnClickListener {
            findNavController().navigate(com.example.foodapp.R.id.action_ProductThreeFragment_to_PaymentFragment)
        }
        val backIV4 = view.findViewById<ImageView>(R.id.backIV4)
        backIV4.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}