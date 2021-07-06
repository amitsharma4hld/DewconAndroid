package com.construction.application.ui.fragments

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SuccessFragmentArgs(
  public val id: String?,
  public val msg: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("id", this.id)
    result.putString("msg", this.msg)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SuccessFragmentArgs {
      bundle.setClassLoader(SuccessFragmentArgs::class.java.classLoader)
      val __id : String?
      if (bundle.containsKey("id")) {
        __id = bundle.getString("id")
      } else {
        throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
      }
      val __msg : String?
      if (bundle.containsKey("msg")) {
        __msg = bundle.getString("msg")
      } else {
        throw IllegalArgumentException("Required argument \"msg\" is missing and does not have an android:defaultValue")
      }
      return SuccessFragmentArgs(__id, __msg)
    }
  }
}
