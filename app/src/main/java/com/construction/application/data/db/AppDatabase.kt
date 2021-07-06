package com.construction.application.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.construction.application.data.db.dao.ReportDao
import com.construction.application.data.db.entities.PoliceBackupEntity
import javax.inject.Inject

@Database(
    entities = [
        PoliceBackupEntity::class
    ],
    version = 1
)

abstract class AppDatabase : RoomDatabase(){
    abstract fun getReportDao(): ReportDao
}

