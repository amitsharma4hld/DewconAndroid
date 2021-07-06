package com.construction.application.ui.fragments.servicelinereport

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.construction.application.R

public class ServiceLineReportFragmentDirections private constructor() {
  public companion object {
    public fun actionServiceLineReportFragmentToServiceLineTwoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_serviceLineReportFragment_to_serviceLineTwoFragment)
  }
}
