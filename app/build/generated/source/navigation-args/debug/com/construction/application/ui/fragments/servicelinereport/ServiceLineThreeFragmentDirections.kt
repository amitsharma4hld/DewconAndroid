package com.construction.application.ui.fragments.servicelinereport

import android.os.Bundle
import androidx.navigation.NavDirections
import com.construction.application.R
import kotlin.Int
import kotlin.String

public class ServiceLineThreeFragmentDirections private constructor() {
  private data class ActionServiceLineThreeFragmentToSuccessFragment(
    public val id: String?,
    public val msg: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_serviceLineThreeFragment_to_successFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("id", this.id)
      result.putString("msg", this.msg)
      return result
    }
  }

  public companion object {
    public fun actionServiceLineThreeFragmentToSuccessFragment(id: String?, msg: String?):
        NavDirections = ActionServiceLineThreeFragmentToSuccessFragment(id, msg)
  }
}
