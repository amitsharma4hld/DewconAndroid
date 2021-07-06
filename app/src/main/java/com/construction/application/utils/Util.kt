package com.construction.application.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.app.DatePickerDialog
import android.content.ContentResolver
import android.content.Context
import android.content.DialogInterface
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.net.Uri
import android.provider.OpenableColumns
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import com.construction.application.R
import com.construction.application.data.HomeMenu
import com.construction.application.data.network.Resource
import com.construction.application.ui.fragments.policebackup.PoliceBackupFragment
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.rommansabbir.networkx.core.NetworkXCore
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

// ======= Static Home Menus ========
val homeMenu = listOf(
    HomeMenu(0,"Tww valve contract", R.mipmap.ic_baker_tww), HomeMenu(1,"Service line report", R.drawable.ic_service_line_report),
    HomeMenu(2,"Top soil seed", R.mipmap.ic_baker_top_soil_seed), HomeMenu(3,"Meter report", R.mipmap.ic_baker_meter_report),
    HomeMenu(4,"Infra red burn report", R.mipmap.ic_baker_infrared_report), HomeMenu(5,"Cleaning report", R.mipmap.ic_baker_cleaning_report),
    HomeMenu(6,"Hours Input", R.mipmap.ic_baker_hours_input), HomeMenu(7,"Concrete Road", R.mipmap.ic_baker_concrete_road),
    HomeMenu(8,"Saw Cut", R.mipmap.ic_baker_saw_cut), HomeMenu(9,"Sidewalk / Curb install", R.mipmap.ic_baker_sidewalk),
    HomeMenu(10,"Police Backup", R.mipmap.ic_baker_police_backup), HomeMenu(11,"Bypass Install", R.mipmap.ic_baker_bypass_install)
)

const val TAG = "AppDebug"

fun View.visible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun basicAlert(context: Context,positiveButtonClick:DialogInterface.OnClickListener,
                    negativeButtonClick:DialogInterface.OnClickListener,neutralButtonClick:DialogInterface.OnClickListener){
    val builder = AlertDialog.Builder(context)
    with(builder)
    {
        setTitle("No Internet Connection")
        setMessage("Please connect with an internet to save data online.")
        setPositiveButton("Retry",  positiveButtonClick)
        setNegativeButton("Save Offline", negativeButtonClick)
        setNeutralButton("Cancel", neutralButtonClick)
        setCancelable(false)
        show()
    }

}

fun isInternetConnected():Boolean {
    return NetworkXCore.getNetworkX().isInternetConnected()
}


fun View.enable(enabled: Boolean) {
    isEnabled = enabled
    alpha = if (enabled) 1f else 0.5f
}

// snackBar
fun View.snackbar(message: String, action: (() -> Unit)? = null) {
    val snackbar = Snackbar.make(this, message, Snackbar.LENGTH_LONG).setBackgroundTint(Color.DKGRAY).setTextColor(Color.YELLOW)
    action?.let {
        snackbar.setAction("Retry") {
            it()
        }
    }
    snackbar.show()
}

fun View.setEnabledRecursively(enabled: Boolean, window: Window) {
    isEnabled = enabled
    if(isEnabled) window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    else window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
}

fun getDatePickerDialog(context: Context, policeBackupFragment: PoliceBackupFragment){
    val day: Int
    val month: Int
    val year: Int
    val calendar: Calendar = Calendar.getInstance()
    day = calendar.get(Calendar.DAY_OF_MONTH)
    month = calendar.get(Calendar.MONTH)
    year = calendar.get(Calendar.YEAR)

    val datePickerDialog =
        DatePickerDialog(context, policeBackupFragment, year, month, day)
    datePickerDialog.show()
}

@SuppressLint("SimpleDateFormat")
fun generateGUID(length: Int): String {
    val uuid = UUID.randomUUID()
    val sDateFormat = SimpleDateFormat("yyyyMMddhhmmss")
    val date: String = sDateFormat.format(Date())
    return (date + uuid.toString().substring(0, 7)
            + randomString(length))
}

@SuppressLint("SimpleDateFormat")
fun generateFileNameInMilliSec(): String? {
    val sDateFormat = SimpleDateFormat("yyyyMMddhhmmss")
    return sDateFormat.format(Date())
}

private fun randomString(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun isFieldNotEmpty(field:String): Boolean {
    if (field.trim().isEmpty()) {
        // this.snackbar("Licence number can not be empty")
        return false
    }
    return true
}

// == To prevent false click
fun View.onThrottledClick(
    throttleDelay: Long = 500L,
    onClick: (View) -> Unit
) {
    setOnClickListener {
        onClick(this)
        isClickable = false
        postDelayed({ isClickable = true }, throttleDelay)
    }
}

fun View.TextWatcher(textInputEditText: TextInputEditText){
    textInputEditText.doOnTextChanged { text, start, before, count ->
       if (text!!.isNotEmpty()){
           when (this.id){
               R.id.txt_ll_crew_leader ->{
                   Toast.makeText(this.context, "crew leader", Toast.LENGTH_SHORT).show() }

           }
           textInputEditText.error = null
       }
    }
}

fun ContentResolver.getFileName(fileUri: Uri): String {
    var name = ""
    val returnCursor = this.query(fileUri, null, null, null, null)
    if (returnCursor != null) {
        val nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        returnCursor.moveToFirst()
        name = returnCursor.getString(nameIndex)
        returnCursor.close()
    }
    return name
}

fun createImageFileRequestBody(imageFilePathUri: Uri, activity: Activity):File{
    val policeSheetOne = activity.contentResolver.openFileDescriptor(imageFilePathUri, "r", null)
    val inputStream = FileInputStream(policeSheetOne?.fileDescriptor)
    val filePoliceSheetOne = File(activity.cacheDir, activity.contentResolver.getFileName(
        imageFilePathUri
    ))
    val outputStream = FileOutputStream(filePoliceSheetOne)
    inputStream.copyTo(outputStream)

    return filePoliceSheetOne
}

 fun convertByteArrayToFile(fileName: String, activity: Activity, byteArray: ByteArray?): File {
    //create a file to write bitmap data
    val file = File(activity.cacheDir, fileName)
    file.createNewFile()
    /*//Convert bitmap to byte array
    val bos = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, 0 *//*ignored for PNG*//*, bos)
    val bitMapData = bos.toByteArray()*/
    //write the bytes in file
    var fos: FileOutputStream? = null
    try {
        fos = FileOutputStream(file)
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    }
    try {
        fos?.write(byteArray)
        fos?.flush()
        fos?.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return file
}

fun convertBitMapToBytArray(bitmap: Bitmap?): ByteArray {
    val outputStream = ByteArrayOutputStream()
    bitmap?.compress(Bitmap.CompressFormat.JPEG, 20, outputStream)
    return outputStream.toByteArray()
}
fun convertBytArrayToBitMap(byteArray: ByteArray): Bitmap {
    return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
}

// TO check if any object is null
fun Any?.isNull() = this == null

fun Fragment.handleApiError(
    failure: Resource.Failure,
    retry: (() -> Unit)? = null
) {
    when {
        failure.isNetworkError -> {
            requireView().snackbar("Please check you internet connection", retry)
        }
        failure.errorCode == 401 -> {

        }
        failure.errorCode == 402 ->{

        }
        else -> {
            val error = failure.errorBody?.string().toString()
            requireView().snackbar(error)
        }
    }

}
