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


class ProductFourFragment : Fragment(R.layout.fragment_product_four) {

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
        binding.button10.setOnClickListener {
            findNavController().navigate(com.example.foodapp.R.id.action_ProductFourFragment_to_PaymentFragment)
        }

        val backIV2 = view.findViewById<ImageView>(R.id.backIV2)
        backIV2.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}