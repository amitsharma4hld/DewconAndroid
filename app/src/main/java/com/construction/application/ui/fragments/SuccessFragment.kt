package com.construction.application.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.construction.application.R
import com.construction.application.databinding.FragmentSucessBinding


class SuccessFragment : Fragment(R.layout.fragment_sucess) {

    private lateinit var binding: FragmentSucessBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSucessBinding.bind(view)

        Handler(Looper.getMainLooper()).postDelayed({
            // navController.popBackStack()
            val action = SuccessFragmentDirections.actionSuccessFragmentToHomeFragment()
            Navigation.findNavController(requireView()).navigate(action)

        }, 3000)
    }


}