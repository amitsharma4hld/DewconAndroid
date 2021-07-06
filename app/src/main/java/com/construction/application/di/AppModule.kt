package com.construction.application.di

import android.content.Context
import androidx.room.Room
import com.construction.application.data.db.AppDatabase
import com.construction.application.data.db.dao.ReportDao
import com.construction.application.data.network.RemoteDataSource
import com.construction.application.data.network.api.ReportApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideReportApi(@ApplicationContext context: Context, remoteDataSource: RemoteDataSource )
    :ReportApi{
        return remoteDataSource.buildApi(ReportApi::class.java)
    }

    @Provides
    fun provideRoomDb(appDatabase: AppDatabase): ReportDao {
        return appDatabase.getReportDao()
    }

    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "DewconDatabase.db"
        ).build()
    }
    /*@Provides
    fun provideRoomDb(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "DewconDatabase.d"
        ).build()
    }*/
}