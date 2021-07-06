package com.construction.application.data.network.api

import com.construction.application.data.responses.PoliceBackupResponse
import com.construction.application.data.responses.SearchResponse
import com.construction.application.data.responses.ServiceLineResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ReportApi {

    @FormUrlEncoded
    @POST("api/ServiceLine")
    suspend fun insertServiceLineReport(
        @Field("Crew_leader")  crew_leader: String,
        @Field("Date") date: String,
        @Field("WorkAddress") work_address: String,
        @Field("WorkOrderNumber") work_order_number: String,
        @Field("EnterTown") enter_town: String,
    ) : ServiceLineResponse

    @Multipart
    @POST("api/PoliceBackup")
    suspend fun insertPoliceBackupOnline(
        @Part("CrewLeader") crew_leader: RequestBody,
        @Part("Date") date: RequestBody,
        @Part("WorkAddress") work_address: RequestBody,
        @Part("WorkOrderNumber") work_order_number: RequestBody,
        @Part("OfficerName") officer_name: RequestBody,
        @Part("PoliceDepartment") police_department: RequestBody,
        @Part("HoursWorked") hours_worked: RequestBody,
        @Part("car") is_car_used: RequestBody,
        @Part UPloadImage1: MultipartBody.Part?,
        @Part UPloadImage2: MultipartBody.Part?,
        @Part UPloadImage3: MultipartBody.Part?,
        @Part("LocalId") localId: RequestBody
        ) : PoliceBackupResponse

    @GET("api/SearchWebapi")
    suspend fun search(@Query("search") char: String) : SearchResponse

    /*companion object{
        operator fun invoke(
            networkConnectionInterceptor: NetworkConnectionInterceptor
        ) : ReportApi {
            val okkHttpClient = OkHttpClient.Builder()
                .addInterceptor(networkConnectionInterceptor)
                .build()
            return Retrofit.Builder()
                .client(okkHttpClient)
                .baseUrl("http://35.194.73.39/wp-json/diabeties-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ReportApi::class.java)
        }
    }*/
}

