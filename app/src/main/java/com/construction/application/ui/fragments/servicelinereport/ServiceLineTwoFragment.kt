package com.construction.application.ui.fragments.servicelinereport

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.construction.application.R


class ServiceLineTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_service_line_two, container, false)
    }

    override fun onStart() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        super.onStart()
    }

}