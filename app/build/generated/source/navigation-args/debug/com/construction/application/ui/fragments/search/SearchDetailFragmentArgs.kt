package com.construction.application.ui.fragments.search

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SearchDetailFragmentArgs(
  public val activityNote: String?,
  public val assignment: String?,
  public val department: String?,
  public val location: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("activityNote", this.activityNote)
    result.putString("assignment", this.assignment)
    result.putString("department", this.department)
    result.putString("location", this.location)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SearchDetailFragmentArgs {
      bundle.setClassLoader(SearchDetailFragmentArgs::class.java.classLoader)
      val __activityNote : String?
      if (bundle.containsKey("activityNote")) {
        __activityNote = bundle.getString("activityNote")
      } else {
        throw IllegalArgumentException("Required argument \"activityNote\" is missing and does not have an android:defaultValue")
      }
      val __assignment : String?
      if (bundle.containsKey("assignment")) {
        __assignment = bundle.getString("assignment")
      } else {
        throw IllegalArgumentException("Required argument \"assignment\" is missing and does not have an android:defaultValue")
      }
      val __department : String?
      if (bundle.containsKey("department")) {
        __department = bundle.getString("department")
      } else {
        throw IllegalArgumentException("Required argument \"department\" is missing and does not have an android:defaultValue")
      }
      val __location : String?
      if (bundle.containsKey("location")) {
        __location = bundle.getString("location")
      } else {
        throw IllegalArgumentException("Required argument \"location\" is missing and does not have an android:defaultValue")
      }
      return SearchDetailFragmentArgs(__activityNote, __assignment, __department, __location)
    }
  }
}
