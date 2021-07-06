package com.construction.application.ui.fragments.tww

import android.os.Bundle
import androidx.navigation.NavDirections
import com.construction.application.R
import kotlin.Int
import kotlin.String

public class TwwValueContractFragmentDirections private constructor() {
  private data class ActionTwwValueContractFragmentToSuccessFragment(
    public val id: String?,
    public val msg: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_twwValueContractFragment_to_successFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("id", this.id)
      result.putString("msg", this.msg)
      return result
    }
  }

  public companion object {
    public fun actionTwwValueContractFragmentToSuccessFragment(id: String?, msg: String?):
        NavDirections = ActionTwwValueContractFragmentToSuccessFragment(id, msg)
  }
}
