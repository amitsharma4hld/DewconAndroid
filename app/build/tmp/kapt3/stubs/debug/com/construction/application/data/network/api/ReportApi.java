package com.construction.application.data.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u008f\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012JC\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u00152\b\b\u0001\u0010\u0007\u001a\u00020\u00152\b\b\u0001\u0010\b\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/construction/application/data/network/api/ReportApi;", "", "insertPoliceBackupOnline", "Lcom/construction/application/data/responses/PoliceBackupResponse;", "crew_leader", "Lokhttp3/RequestBody;", "date", "work_address", "work_order_number", "officer_name", "police_department", "hours_worked", "is_car_used", "UPloadImage1", "Lokhttp3/MultipartBody$Part;", "UPloadImage2", "UPloadImage3", "localId", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertServiceLineReport", "Lcom/construction/application/data/responses/ServiceLineResponse;", "", "enter_town", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/construction/application/data/responses/SearchResponse;", "char", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ReportApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/ServiceLine")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object insertServiceLineReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "Crew_leader")
    java.lang.String crew_leader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "Date")
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "WorkAddress")
    java.lang.String work_address, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "WorkOrderNumber")
    java.lang.String work_order_number, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "EnterTown")
    java.lang.String enter_town, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.construction.application.data.responses.ServiceLineResponse> p5);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/PoliceBackup")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object insertPoliceBackupOnline(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "CrewLeader")
    okhttp3.RequestBody crew_leader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "Date")
    okhttp3.RequestBody date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "WorkAddress")
    okhttp3.RequestBody work_address, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "WorkOrderNumber")
    okhttp3.RequestBody work_order_number, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "OfficerName")
    okhttp3.RequestBody officer_name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "PoliceDepartment")
    okhttp3.RequestBody police_department, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "HoursWorked")
    okhttp3.RequestBody hours_worked, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "car")
    okhttp3.RequestBody is_car_used, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part UPloadImage1, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part UPloadImage2, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part UPloadImage3, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "LocalId")
    okhttp3.RequestBody localId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.construction.application.data.responses.PoliceBackupResponse> p12);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/SearchWebapi")
    public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String p0_1526187, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.construction.application.data.responses.SearchResponse> p1);
}