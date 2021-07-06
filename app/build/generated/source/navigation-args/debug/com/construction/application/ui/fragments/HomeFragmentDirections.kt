package com.construction.application.ui.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.construction.application.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToSearchDetailFragment(
    public val activityNote: String?,
    public val assignment: String?,
    public val department: String?,
    public val location: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_searchDetailFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("activityNote", this.activityNote)
      result.putString("assignment", this.assignment)
      result.putString("department", this.department)
      result.putString("location", this.location)
      return result
    }
  }

  public companion object {
    public fun actionHomeFragmentToSearchDetailFragment(
      activityNote: String?,
      assignment: String?,
      department: String?,
      location: String?
    ): NavDirections = ActionHomeFragmentToSearchDetailFragment(activityNote, assignment,
        department, location)

    public fun actionHomeFragmentToPoliceBackupFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_policeBackupFragment)

    public fun actionHomeFragmentToTwwValueContractFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_twwValueContractFragment)

    public fun actionHomeFragmentToServiceLineReportFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_serviceLineReportFragment)

    public fun actionHomeFragmentToTopSoilSeedFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_topSoilSeedFragment)
  }
}
