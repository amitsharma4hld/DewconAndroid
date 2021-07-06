package com.construction.application.ui.fragments.servicelinereport

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.construction.application.R

public class ServiceLineTwoFragmentDirections private constructor() {
  public companion object {
    public fun actionServiceLineTwoFragmentToServiceLineThreeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_serviceLineTwoFragment_to_serviceLineThreeFragment)
  }
}
