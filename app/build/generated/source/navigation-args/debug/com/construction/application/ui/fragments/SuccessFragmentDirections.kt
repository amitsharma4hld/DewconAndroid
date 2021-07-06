package com.construction.application.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.construction.application.R

public class SuccessFragmentDirections private constructor() {
  public companion object {
    public fun actionSuccessFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_successFragment_to_homeFragment)
  }
}
