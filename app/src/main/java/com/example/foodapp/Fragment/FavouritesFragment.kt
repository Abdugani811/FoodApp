package com.example.foodapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.foodapp.R

class FavouritesFragment : Fragment(R.layout.fragment_favourites) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backIV9 = view.findViewById<ImageView>(R.id.backIV9)
        backIV9.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}