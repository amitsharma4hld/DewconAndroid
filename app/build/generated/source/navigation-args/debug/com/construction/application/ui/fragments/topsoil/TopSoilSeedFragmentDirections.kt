package com.construction.application.ui.fragments.topsoil

import android.os.Bundle
import androidx.navigation.NavDirections
import com.construction.application.R
import kotlin.Int
import kotlin.String

public class TopSoilSeedFragmentDirections private constructor() {
  private data class ActionTopSoilSeedFragmentToSuccessFragment(
    public val id: String?,
    public val msg: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_topSoilSeedFragment_to_successFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("id", this.id)
      result.putString("msg", this.msg)
      return result
    }
  }

  public companion object {
    public fun actionTopSoilSeedFragmentToSuccessFragment(id: String?, msg: String?): NavDirections
        = ActionTopSoilSeedFragmentToSuccessFragment(id, msg)
  }
}
