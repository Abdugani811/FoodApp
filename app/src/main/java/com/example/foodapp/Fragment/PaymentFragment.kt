package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentPaymentBinding
import com.example.foodapp.databinding.FragmentProductOneBinding

class PaymentFragment : Fragment(R.layout.fragment_payment) {

    private var _binding: FragmentPaymentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaymentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.playNowBtn.setOnClickListener {
            findNavController().navigate(com.example.foodapp.R.id.action_PaymentFragment_to_PopUpMessageFragment2)
        }

        val backIV8 = view.findViewById<ImageView>(R.id.backIV8)
        backIV8.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}