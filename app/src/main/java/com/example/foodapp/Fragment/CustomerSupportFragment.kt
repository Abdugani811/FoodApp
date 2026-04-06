package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.foodapp.R


class CustomerSupportFragment : Fragment(R.layout.fragment_customer_support) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backIV10 = view.findViewById<ImageView>(R.id.back10)
        backIV10.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}