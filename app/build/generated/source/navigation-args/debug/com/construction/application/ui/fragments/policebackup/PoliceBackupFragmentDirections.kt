package com.construction.application.ui.fragments.policebackup

import android.os.Bundle
import androidx.navigation.NavDirections
import com.construction.application.R
import kotlin.Int
import kotlin.String

public class PoliceBackupFragmentDirections private constructor() {
  private data class ActionPoliceBackupFragmentToSuccessFragment(
    public val id: String?,
    public val msg: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_policeBackupFragment_to_successFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("id", this.id)
      result.putString("msg", this.msg)
      return result
    }
  }

  public companion object {
    public fun actionPoliceBackupFragmentToSuccessFragment(id: String?, msg: String?): NavDirections
        = ActionPoliceBackupFragmentToSuccessFragment(id, msg)
  }
}
