package com.construction.application.ui.report

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.construction.application.data.db.entities.PoliceBackupEntity
import com.construction.application.data.network.Resource
import com.construction.application.data.repository.ReportRepository
import com.construction.application.data.responses.PoliceBackupResponse
import com.construction.application.data.responses.SearchResponse
import com.construction.application.data.responses.ServiceLineResponse
import com.construction.application.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.util.ArrayList
import javax.inject.Inject

@HiltViewModel
class  ReportViewModel @Inject constructor(
    private val repository: ReportRepository,
): BaseViewModel(repository) {
    private val _serviceLineResponse : MutableLiveData<Resource<ServiceLineResponse>> = MutableLiveData()
    private val _searchResponse : MutableLiveData<Resource<SearchResponse>> = MutableLiveData()
    private val _policeBackupResponse : MutableLiveData<Resource<PoliceBackupResponse>> = MutableLiveData()
    // private val _policeBackupLocalResponse : MutableLiveData<>
    private var _policeBackupSyncStatus: MutableLiveData<Resource<PoliceBackupEntity>> = MutableLiveData()
   // private val symptom = MutableLiveData<List<PoliceBackupEntity>>()
   private val allNotes: LiveData<List<PoliceBackupEntity>>? = null


    val serviceLineResponse: LiveData<Resource<ServiceLineResponse>>
        get() = _serviceLineResponse
    fun  insertServiceLineReport(
        crew_leader:String,
        date:String,
        work_address:String,
        work_order_number:String,
        enter_town:String
    ) = viewModelScope.launch {
        _serviceLineResponse.value = Resource.Loading
        _serviceLineResponse.value = repository.insertServiceLineReportRepo(crew_leader,date, work_address, work_order_number, enter_town)
    }

    val policeBackupResponse: LiveData<Resource<PoliceBackupResponse>>
        get() = _policeBackupResponse
    fun  insertPoliceBackupReport(
        crew_leader: RequestBody,
        date:RequestBody,
        work_address:RequestBody,
        work_order_number:RequestBody,
        officer_name:RequestBody,
        police_department:RequestBody,
        hours_worked:RequestBody,
        is_car_used:RequestBody,
        police_sheet_img_one: MultipartBody.Part?,
        police_sheet_img_two:MultipartBody.Part?,
        police_sheet_img_three:MultipartBody.Part?,
        localId:RequestBody
    ) = viewModelScope.launch {
        _policeBackupResponse.value = Resource.Loading
        _policeBackupResponse.value = repository.insertPoliceBackupReportRepo(crew_leader,date, work_address, work_order_number, officer_name,
            police_department, hours_worked, is_car_used, police_sheet_img_one, police_sheet_img_two, police_sheet_img_three,localId)
    }

    val callSearchResponse: LiveData<Resource<SearchResponse>>
    get() = _searchResponse
    fun getSearchResult(char:String) = viewModelScope.launch {
        _searchResponse.value = Resource.Loading
        _searchResponse.value = repository.getAllPost(char)
    }

    suspend fun savePoliceBackupData(policeBackupEntity : PoliceBackupEntity){
        repository.saveData(policeBackupEntity)
    }

    suspend fun updatePoliceBackupSyncStatus(isSynced:Boolean,localRegId:String) = repository.updatePoliceBackupSyncedStatus(isSynced,localRegId)
    //val policeBackupLocalResponse: LiveData<Resource<PoliceBackupEntity>>
    //get() = _policeBackupSyncStatus
    suspend fun getPoliceBackupSyncStatusModel(isSynced:Boolean) =  repository.getPoliceBackupSynStatusRepo(isSynced)
}