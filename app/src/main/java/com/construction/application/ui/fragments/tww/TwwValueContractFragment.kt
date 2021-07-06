package com.construction.application.ui.fragments.tww

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.construction.application.R


class TwwValueContractFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tww_value_contract, container, false)
    }
    override fun onStart() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        super.onStart()
    }

}