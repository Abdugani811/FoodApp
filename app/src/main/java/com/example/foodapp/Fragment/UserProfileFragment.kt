package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.foodapp.R


class UserProfileFragment : Fragment(R.layout.fragment_user_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backIV6 = view.findViewById<ImageView>(R.id.backIV6)
        backIV6.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}