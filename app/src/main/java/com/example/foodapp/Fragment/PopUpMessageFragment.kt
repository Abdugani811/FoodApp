package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.foodapp.R


class PopUpMessageFragment : Fragment(R.layout.fragment_pop_up_message) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backIV7 = view.findViewById<ImageView>(R.id.backIV7)
        backIV7.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}