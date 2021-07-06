package com.construction.application.ui.fragments.topsoil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.construction.application.R


class TopSoilSeedFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_soil_seed, container, false)
    }

    override fun onStart() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        super.onStart()
    }

}