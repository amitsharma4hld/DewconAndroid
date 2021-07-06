package com.construction.application.data.repository

import androidx.lifecycle.LiveData
import com.construction.application.data.db.AppDatabase
import com.construction.application.data.db.entities.PoliceBackupEntity
import com.construction.application.data.network.api.ReportApi
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.util.ArrayList
import javax.inject.Inject


class ReportRepository @Inject constructor(
    private val api: ReportApi,
    private val db: AppDatabase
): BaseRepository(){

    suspend fun insertServiceLineReportRepo(
        crew_leader:String,
        date:String,
        work_address:String,
        work_order_number:String,
        enter_town:String
    ) = safeApiCall{
        api.insertServiceLineReport(crew_leader,date, work_address, work_order_number, enter_town)
    }

    suspend fun insertPoliceBackupReportRepo(
        crew_leader:RequestBody,
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
        localRegId: RequestBody
    ) = safeApiCall {
        api.insertPoliceBackupOnline(crew_leader,date, work_address, work_order_number, officer_name,
            police_department, hours_worked, is_car_used, police_sheet_img_one, police_sheet_img_two, police_sheet_img_three,localRegId)
    }

    suspend fun getAllPost(char:String) = safeApiCall {
        api.search(char)
    }

    // ======= Save ' PoliceBackup Report ' intro ROOM DB =======
    suspend fun saveData(policeBackupEntity: PoliceBackupEntity) = db.getReportDao().insertPoliceBackupToRoomDb(policeBackupEntity)

    suspend fun getPoliceBackupSynStatusRepo(isSynced:Boolean) = db.getReportDao().getPoliceBackupOfflineData(isSynced)

    suspend fun updatePoliceBackupSyncedStatus(isSynced: Boolean,localRegId:String) = db.getReportDao().updateSyncStatus(isSynced,localRegId)
}