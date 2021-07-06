package com.construction.application.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.construction.application.data.db.entities.PoliceBackupEntity

@Dao
interface ReportDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPoliceBackupToRoomDb(policeBackupEntity: PoliceBackupEntity)

    @Query("SELECT *  FROM PoliceBackupEntity  WHERE synced=:isSync")
    suspend fun getPoliceBackupOfflineData(isSync:Boolean): List<PoliceBackupEntity>

    @Query("UPDATE PoliceBackupEntity SET synced=:isSynced WHERE registration_id=:localId")
    suspend fun updateSyncStatus(isSynced:Boolean, localId:String)


}