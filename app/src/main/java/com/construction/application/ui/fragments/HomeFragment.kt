package com.construction.application.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.construction.application.R
import com.construction.application.data.HomeMenu
import com.construction.application.data.db.AppDatabase
import com.construction.application.data.db.entities.PoliceBackupEntity
import com.construction.application.data.network.Resource
import com.construction.application.data.network.UploadRequestBody
import com.construction.application.data.responses.SearchResponse
import com.construction.application.databinding.FragmentHomeBinding
import com.construction.application.ui.fragments.policebackup.PoliceBackupFragmentDirections
import com.construction.application.ui.report.ReportViewModel
import com.construction.application.utils.*
import com.rommansabbir.networkx.core.NetworkXCore
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.ArrayList

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home),UploadRequestBody.UploadCallback  {

    private lateinit var binding: FragmentHomeBinding
    // @Inject lateinit var remoteDataSource: RemoteDataSource
    private  val viewModel: ReportViewModel by viewModels()
    private var policeBackupEntityList:List<PoliceBackupEntity> = ArrayList()
    var isInProcess:Boolean = false


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        showMenus(homeMenu)
        setupMenuItems()
        binding.etAutoCompleteTextView.doOnTextChanged  { text, start, count, after ->
            viewModel.getSearchResult(text.toString())
        }
        viewModel.policeBackupResponse.observe(viewLifecycleOwner, Observer {
            binding.clRoot.snackbar("Offline data Syncing..")
            when(it) {
                is Resource.Success -> {
                    Coroutines.io {
                        viewModel.updatePoliceBackupSyncStatus(true,it.value.Item3.LocalId)
                    }
                    isInProcess = false
                }
                is Resource.Failure -> {
                    handleApiError(it)
                    isInProcess = false
                }
            }
        })
        /*viewModel.serviceLineResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Success -> {
                }
                is Resource.Failure -> {
                    Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_LONG).show()
                }
            }
        })*/
        viewModel.callSearchResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Success -> {
                    val autoSuggestAdapter = AutoSuggestAdapter(requireContext(), it.value)
                    binding.etAutoCompleteTextView.setAdapter(autoSuggestAdapter)
                }
                is Resource.Failure -> {
                    Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_LONG).show()
                }
            }
        })
        setupSearchAutoSuggestions()
        viewModel.getSearchResult("")
            NetworkXCore.getNetworkX().isInternetConnectedLiveData().observe(viewLifecycleOwner, Observer {
                when (it) {
                    true -> {
                        Coroutines.io {
                            if (!isInProcess){
                                policeBackupEntityList = viewModel.getPoliceBackupSyncStatusModel(false)
                                if (policeBackupEntityList.isNotEmpty()){
                                    for (i in policeBackupEntityList.indices){
                                        isInProcess = true
                                        Log.e("Local PoliceBackup:", policeBackupEntityList[i].date)
                                        policeBackupEntityList[i].also { policeOfflineBackup ->
                                            submitReportOnline(policeOfflineBackup.crew_leader,policeOfflineBackup.date,policeOfflineBackup.work_address,
                                                policeOfflineBackup.work_order_number,policeOfflineBackup.officer_name, policeOfflineBackup.police_department,
                                                policeOfflineBackup.hours_worked,policeOfflineBackup.is_car_used,policeOfflineBackup.police_sheet_img_one,
                                                policeOfflineBackup.police_sheet_img_two,policeOfflineBackup.police_sheet_img_three,policeOfflineBackup.registration_id)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            )



    }

    private fun setupMenuItems() {
        binding.ivAppSetting.setOnClickListener {
            val popupMenu = PopupMenu(requireContext(), it)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId){
                    R.id.action_one -> {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://amitsharma4hld-001-site1.itempurl.com/Adminelogin.aspx"))
                        startActivity(intent)
                        true
                    }
                    R.id.action_two -> {
                        Toast.makeText(requireContext(), "Share Toast!", Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> false
                }
            }
            popupMenu.inflate(R.menu.menu)
            try {
                val fieldMPopup = PopupMenu::class.java.getDeclaredField("mPopup")
                fieldMPopup.isAccessible = true
                val mPopup = fieldMPopup.get(popupMenu)
                mPopup.javaClass
                    .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                    .invoke(mPopup, true)
            } catch (e: Exception){
                Log.e("Main", "Error showing menu icons.", e)
            } finally {
                popupMenu.show()
            }
        }
    }


    private fun setupSearchAutoSuggestions() {
        binding.etAutoCompleteTextView.threshold = 1
        binding.etAutoCompleteTextView.setDropDownBackgroundResource(R.color.white)
        binding.etAutoCompleteTextView.setOnItemClickListener() { parent, _, position, id ->
            val selectedPoi = parent.adapter.getItem(position) as SearchResponse.SearchResponseItem?
            binding.etAutoCompleteTextView.text = null

            val action = HomeFragmentDirections.actionHomeFragmentToSearchDetailFragment(selectedPoi?.Activity_Note,
                selectedPoi?.Assignment_Status,selectedPoi?.Department1,selectedPoi?.Location)
            Navigation.findNavController(requireView()).navigate(action)

        }
    }

    private fun showMenus(menusList: List<HomeMenu>) {
        binding.rvPrentalVisitRecord.layoutManager = GridLayoutManager(activity, 3)
        binding.rvPrentalVisitRecord.addItemDecoration(SpaceGridDecoration(2, 2, false))
        binding.rvPrentalVisitRecord.adapter = HomeMenuRecycleAdapter(menusList)
    }

    override fun onResume() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        super.onResume()
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
        policeSheetOneByteArray: ByteArray?,
        policeSheetTwoByteArray: ByteArray?,
        policeSheetThreeByteArray: ByteArray?,
        localId: String
    ) {
        // === policeSheetOneUri ===
        var imageOneMultipartFormData: MultipartBody.Part? = null
        if (policeSheetOneByteArray != null && policeSheetOneByteArray.isNotEmpty()) {
            val imageFileOne = convertByteArrayToFile(generateGUID(5)+".jpeg",requireActivity(),policeSheetOneByteArray)
            val policeSheetOneImageBody = UploadRequestBody(imageFileOne, "image", this)
            imageOneMultipartFormData = MultipartBody.Part.createFormData("UPloadImage1", imageFileOne.name, policeSheetOneImageBody)
            Log.e("UPloadImage1 one name :",imageFileOne.name)
        }

        // === policeSheetTwoUri ===
        var imageTwoMultipartFormData: MultipartBody.Part? = null
        if (policeSheetTwoByteArray != null && policeSheetTwoByteArray.isNotEmpty()) {
            val imageFileTwo = convertByteArrayToFile(generateGUID(4)+".jpeg",requireActivity(),policeSheetTwoByteArray)
            val policeSheetTwoImageBody = UploadRequestBody(imageFileTwo, "image", this)
            imageTwoMultipartFormData = MultipartBody.Part.createFormData("UPloadImage2", imageFileTwo.name, policeSheetTwoImageBody)
        }

        // === policeSheetThreeUri ===
        var imageThreeMultipartFormData: MultipartBody.Part? = null
        if (policeSheetThreeByteArray != null && policeSheetThreeByteArray.isNotEmpty()){
            val imageFileThree = convertByteArrayToFile(generateGUID(3)+".jpeg",requireActivity(),policeSheetThreeByteArray)
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
            imageOneMultipartFormData,
            imageTwoMultipartFormData,
            imageThreeMultipartFormData,
            localId.toRequestBody("multipart/form-data".toMediaTypeOrNull()),
        )
    }

    override fun onProgressUpdate(percentage: Int) {
        Log.e("onProgressUpdate :", percentage.toString())
    }

}