package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.constraintLayout.setOnClickListener {
            findNavController().navigate(com.example.foodapp.R.id.action_HomeFragment_to_ProductOneFragment)
        }
        binding.constraintLayout2.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_ProductTwoFragment)
        }
        binding.constraintLayout3.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_ProductThreeFragment)
        }
        binding.constraintLayout4.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_ProductFourFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}