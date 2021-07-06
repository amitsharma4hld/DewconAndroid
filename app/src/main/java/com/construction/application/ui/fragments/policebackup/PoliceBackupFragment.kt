package com.construction.application.ui.fragments.policebackup

import android.app.Activity
import android.app.DatePickerDialog
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.construction.application.R
import com.construction.application.data.db.entities.PoliceBackupEntity
import com.construction.application.data.network.Resource
import com.construction.application.data.network.UploadRequestBody
import com.construction.application.databinding.FragmentPoliceBackupBinding
import com.construction.application.ui.report.ReportViewModel
import com.construction.application.utils.*
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.ByteArrayOutputStream
import java.util.*


@AndroidEntryPoint
class PoliceBackupFragment : Fragment(R.layout.fragment_police_backup),
    DatePickerDialog.OnDateSetListener, UploadRequestBody.UploadCallback {

    private var policeSheetOneUri: Uri? = null
    private var policeSheetTwoUri: Uri? = null
    private var policeSheetThreeUri: Uri? = null
    private var isCarUsedRadio: Boolean? = null
    private lateinit var binding: FragmentPoliceBackupBinding
    // @Inject lateinit var remoteDataSource: RemoteDataSource
    private  val viewModel: ReportViewModel by viewModels()
    var bitmapPoliceSheetOne:Bitmap? = null
    var bitmapPoliceSheetTwo:Bitmap? = null
    var bitmapPoliceSheetThree:Bitmap? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPoliceBackupBinding.bind(view)

        binding.txtEtDate.setOnClickListener {
            getDatePickerDialog(requireContext(), this)
        }

        binding.radioGroupPolice.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = this.requireView().findViewById(checkedId)
            isCarUsedRadio = radio.text=="Yes"
        }

        binding.btSubmit.onThrottledClick {
            saveReport()
        }
        // To setup text watcher for all the fields ( to undo the error )
        setupTextWatcher()

        binding.llPoliceSheetOne.setOnClickListener {
            openImageChooser(REQUEST_CODE_SHEET_ONE)
        }
        binding.llPoliceSheetTwo.setOnClickListener {
            openImageChooser(REQUEST_CODE_SHEET_TWO)
        }
        binding.llPoliceSheetThree.setOnClickListener {
            openImageChooser(REQUEST_CODE_SHEET_THREE)
        }

        viewModel.policeBackupResponse.observe(viewLifecycleOwner, Observer {
            binding.pbLoading.visible(it is Resource.Loading)
            binding.rootLayout.setEnabledRecursively(it is Resource.Loading, requireActivity().window)
            when(it) {
                is Resource.Success -> {
                    Toast.makeText(requireContext(), it.value.Item3.PoliceBackup_Id.toString(), Toast.LENGTH_SHORT).show()
                    viewModel.policeBackupResponse.removeObservers(viewLifecycleOwner)
                    val action = PoliceBackupFragmentDirections.actionPoliceBackupFragmentToSuccessFragment(it.value.Item3.PoliceBackup_Id.toString(),it.value.Item2)
                    Navigation.findNavController(requireView()).navigate(action)

                }
                is Resource.Failure -> {
                    handleApiError(it)
                }
            }
        })


    }

    private fun saveReport() {
        if (isValidate()) {
            val  crewLeader = binding.txtEtCrewLeader.text.toString()
            val  date = binding.txtEtDate.text.toString()
            val  workAddress = binding.txtEtWorkAddress.text.toString()
            val  workOrderNumber = binding.txtEtWorkOrderNumber.text.toString()
            val  officerName = binding.txtEtOfficerName.text.toString()
            val  policeDepartment = binding.txtEtPoliceDepartment.text.toString()
            val  hoursWorked = binding.txtEtHoursWorked.text.toString()
            val  isCarUsedRadioString = isCarUsedRadio!!.toString()
            var uniqueID = generateGUID(7) + UUID.randomUUID().toString()
            if (isInternetConnected()){
                submitReportOnline(crewLeader,date,workAddress,workOrderNumber,
                    officerName,policeDepartment,hoursWorked,isCarUsedRadioString,uniqueID)
            }else{
                val positiveButtonClick = { dialog: DialogInterface, which: Int ->
                    saveReport()
                }
                val negativeButtonClick = { dialog: DialogInterface, which: Int ->
                    dialog.dismiss()
                    submitReportOffline(crewLeader,date,workAddress,workOrderNumber,
                        officerName,policeDepartment,hoursWorked,isCarUsedRadioString,uniqueID)
                }
                val neutralButtonClick = { dialog: DialogInterface, which: Int ->
                    dialog.dismiss()
                }
                basicAlert(requireContext(),positiveButtonClick,negativeButtonClick,neutralButtonClick)
            }

        }
    }

    private fun setupTextWatcher() {
        binding.txtEtCrewLeader.addTextChangedListener(DynamicTextWatcher(
            onChanged = { text, start, before, count ->
                if (text!!.isNotEmpty()){ binding.txtLlCrewLeader.error = null }
            }
        ))
        binding.txtEtDate.addTextChangedListener(DynamicTextWatcher(
            onChanged = { text, start, before, count ->
                if (text!!.isNotEmpty()){ binding.txtLlDate.error = null }
            }
        ))
        binding.txtEtWorkAddress.addTextChangedListener(DynamicTextWatcher(
            onChanged = { text, start, before, count ->
                if (text!!.isNotEmpty()){ binding.txtLlWorkAddress.error = null }
            }
        ))
    }

    private fun isValidate() : Boolean {
        if (!isFieldNotEmpty(binding.txtEtCrewLeader.text.toString())) {
            binding.txtLlCrewLeader.requestFocus()
            binding.txtLlCrewLeader.error = "Crew leader is must"
            return false
        }
        if (!isFieldNotEmpty(binding.txtEtDate.text.toString())){
            binding.txtLlDate.requestFocus()
            binding.txtLlDate.error = "Please select date first"
            return false
        }
        if (!isFieldNotEmpty(binding.txtEtWorkAddress.text.toString())) {
            binding.txtLlWorkAddress.requestFocus()
            binding.txtLlWorkAddress.error = "Work Address is must"
            return false
        }
        if (!isFieldNotEmpty(binding.txtEtWorkOrderNumber.text.toString())){
            binding.txtLlWorkOrderNumber.requestFocus()
            binding.txtLlWorkOrderNumber.error = "Work Order Number is must"
            return false
        }
        if (!isFieldNotEmpty(binding.txtEtOfficerName.text.toString())){
            binding.txtLlOfficerName.requestFocus()
            binding.txtLlOfficerName.error = "Officer Name is must"
            return false
        }
        if (!isFieldNotEmpty(binding.txtEtPoliceDepartment.text.toString())){
            binding.txtLlPoliceDepartment.requestFocus()
            binding.txtLlOfficerName.error = "Please enter police department"
            return false
        }
        if (isCarUsedRadio.isNull()){
            binding.rootLayout.snackbar("Please select car is used or not")
            return false
        }
        if (policeSheetOneUri == null){
            binding.rootLayout.snackbar("Please select required images")
            return false
        }
        return true
    }

    private fun submitReportOffline(
        crewLeader: String,
        date: String,
        workAddress: String,
        workOrderNumber: String,
        officerName: String,
        policeDepartment: String,
        hoursWorked: String,
        isCarUsedRadioString: String,
        uniqueID: String
    ) {
        binding.pbLoading.visible(true)
        binding.rootLayout.setEnabledRecursively(true, requireActivity().window)

        val policeBackupData = PoliceBackupEntity(0,crewLeader,date,workAddress,
            workOrderNumber,officerName,policeDepartment,hoursWorked,isCarUsedRadioString,
            convertBitMapToBytArray(bitmapPoliceSheetOne),
            convertBitMapToBytArray(bitmapPoliceSheetTwo),
            convertBitMapToBytArray(bitmapPoliceSheetThree),
            0,uniqueID)
        Coroutines.io {
            viewModel.savePoliceBackupData(policeBackupData)
        }
        binding.pbLoading.visible(false)
        binding.rootLayout.setEnabledRecursively(false, requireActivity().window)
        val action = PoliceBackupFragmentDirections.actionPoliceBackupFragmentToSuccessFragment("0","0")
        Navigation.findNavController(requireView()).navigate(action)

    }

    private fun submitReportOnline(
        crewLeader: String,
        date: String,
        workAddress: String,
        workOrderNumber: String,
        officerName: String,
        policeDepartment: String,
        hoursWorked: String,
        isCarUsedRadioString: String,
        localId: String
    ) {
        // === policeSheetOneUri ===
        val imageFileOne = createImageFileRequestBody(policeSheetOneUri!!,requireActivity())
        val policeSheetOneImageBody = UploadRequestBody(imageFileOne, "image", this)

        // === policeSheetTwoUri ===
        var imageTwoMultipartFormData:MultipartBody.Part? = null
        if (!policeSheetTwoUri.isNull()) {
            val imageFileTwo = createImageFileRequestBody(policeSheetTwoUri!!,requireActivity())
            val policeSheetTwoImageBody = UploadRequestBody(imageFileTwo, "image", this)
            imageTwoMultipartFormData = MultipartBody.Part.createFormData("UPloadImage2", imageFileTwo.name, policeSheetTwoImageBody)
        }

        // === policeSheetThreeUri ===
        var imageThreeMultipartFormData:MultipartBody.Part? = null
        if (!policeSheetThreeUri.isNull()){
            val imageFileThree = createImageFileRequestBody(policeSheetThreeUri!!,requireActivity())
            val policeSheetThreeImageBody = UploadRequestBody(imageFileThree, "image", this)
            imageThreeMultipartFormData = MultipartBody.Part.createFormData("UPloadImage3", imageFileThree.name, policeSheetThreeImageBody)
        }

        viewModel.insertPoliceBackupReport(
            crewLeader.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            date.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            workAddress.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            workOrderNumber.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            officerName.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            policeDepartment.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            hoursWorked.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            isCarUsedRadioString.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
            MultipartBody.Part.createFormData("UPloadImage1", imageFileOne.name, policeSheetOneImageBody),
            imageTwoMultipartFormData,
            imageThreeMultipartFormData,
            localId.toRequestBody("multipart/form-data".toMediaTypeOrNull())
            )
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        binding.txtEtDate.setText("$month" + "/" + "$dayOfMonth" +"/" +"$year")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when(requestCode){
                REQUEST_CODE_SHEET_ONE -> {
                    policeSheetOneUri = data?.data
                    binding.ivStatusPoliceSheetImageOne.visibility = View.VISIBLE
                    //var tempBitmapPoliceSheetOne
                    bitmapPoliceSheetOne = MediaStore.Images.Media.getBitmap(requireActivity().contentResolver, policeSheetOneUri)
                    //bitmapPoliceSheetOne = compressBitmap(tempBitmapPoliceSheetOne,10)
                }
                REQUEST_CODE_SHEET_TWO -> {
                    policeSheetTwoUri = data?.data
                    binding.ivStatusPoliceSheetImageTwo.visibility = View.VISIBLE
                    //var tempBitmapPoliceSheetTwo
                    bitmapPoliceSheetTwo= MediaStore.Images.Media.getBitmap(requireActivity().contentResolver, policeSheetTwoUri)
                   // bitmapPoliceSheetTwo = compressBitmap(tempBitmapPoliceSheetTwo,10)
                }
                REQUEST_CODE_SHEET_THREE -> {
                    policeSheetThreeUri = data?.data
                    binding.ivStatusPoliceSheetImageThree.visibility = View.VISIBLE
                    //var tempBitmapPoliceSheetThree
                    bitmapPoliceSheetThree = MediaStore.Images.Media.getBitmap(requireActivity().contentResolver, policeSheetThreeUri)
                    //bitmapPoliceSheetThree = compressBitmap(tempBitmapPoliceSheetThree,10)
                }
            }
        }
    }

    // Method to compress a bitmap
    private fun compressBitmap(bitmap:Bitmap?, quality:Int):Bitmap {
        val stream = ByteArrayOutputStream()
        bitmap!!.compress(Bitmap.CompressFormat.JPEG, quality, stream)
        val byteArray = stream.toByteArray()
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
    }

        private fun openImageChooser(requestCode: Int) {
        Intent(Intent.ACTION_PICK).also {
            it.type = "image/*"
            val mimeType = arrayOf("image/jpeg", "image/png")
            it.putExtra(Intent.EXTRA_MIME_TYPES, mimeType)
            startActivityForResult(it, requestCode)
        }
    }
    companion object {
        private const val REQUEST_CODE_SHEET_ONE = 101
        private const val REQUEST_CODE_SHEET_TWO = 102
        private const val REQUEST_CODE_SHEET_THREE = 103
    }

    override fun onProgressUpdate(percentage: Int) {
        Log.e("onProgressUpdate :", percentage.toString())
    }

    override fun onStart() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        super.onStart()
    }


}