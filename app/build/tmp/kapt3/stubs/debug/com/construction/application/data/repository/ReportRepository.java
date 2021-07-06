package com.construction.application.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J}\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J?\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J!\u0010,\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/construction/application/data/repository/ReportRepository;", "Lcom/construction/application/data/repository/BaseRepository;", "api", "Lcom/construction/application/data/network/api/ReportApi;", "db", "Lcom/construction/application/data/db/AppDatabase;", "(Lcom/construction/application/data/network/api/ReportApi;Lcom/construction/application/data/db/AppDatabase;)V", "getAllPost", "Lcom/construction/application/data/network/Resource;", "Lcom/construction/application/data/responses/SearchResponse;", "char", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPoliceBackupSynStatusRepo", "", "Lcom/construction/application/data/db/entities/PoliceBackupEntity;", "isSynced", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPoliceBackupReportRepo", "Lcom/construction/application/data/responses/PoliceBackupResponse;", "crew_leader", "Lokhttp3/RequestBody;", "date", "work_address", "work_order_number", "officer_name", "police_department", "hours_worked", "is_car_used", "police_sheet_img_one", "Lokhttp3/MultipartBody$Part;", "police_sheet_img_two", "police_sheet_img_three", "localRegId", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertServiceLineReportRepo", "Lcom/construction/application/data/responses/ServiceLineResponse;", "enter_town", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveData", "", "policeBackupEntity", "(Lcom/construction/application/data/db/entities/PoliceBackupEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePoliceBackupSyncedStatus", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ReportRepository extends com.construction.application.data.repository.BaseRepository {
    private final com.construction.application.data.network.api.ReportApi api = null;
    private final com.construction.application.data.db.AppDatabase db = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertServiceLineReportRepo(@org.jetbrains.annotations.NotNull()
    java.lang.String crew_leader, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String work_address, @org.jetbrains.annotations.NotNull()
    java.lang.String work_order_number, @org.jetbrains.annotations.NotNull()
    java.lang.String enter_town, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.construction.application.data.network.Resource<com.construction.application.data.responses.ServiceLineResponse>> p5) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPoliceBackupReportRepo(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody crew_leader, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody date, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody work_address, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody work_order_number, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody officer_name, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody police_department, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody hours_worked, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody is_car_used, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part police_sheet_img_one, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part police_sheet_img_two, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part police_sheet_img_three, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody localRegId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.construction.application.data.network.Resource<com.construction.application.data.responses.PoliceBackupResponse>> p12) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllPost(@org.jetbrains.annotations.NotNull()
    java.lang.String p0_1526187, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.construction.application.data.network.Resource<com.construction.application.data.responses.SearchResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveData(@org.jetbrains.annotations.NotNull()
    com.construction.application.data.db.entities.PoliceBackupEntity policeBackupEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPoliceBackupSynStatusRepo(boolean isSynced, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.construction.application.data.db.entities.PoliceBackupEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePoliceBackupSyncedStatus(boolean isSynced, @org.jetbrains.annotations.NotNull()
    java.lang.String localRegId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public ReportRepository(@org.jetbrains.annotations.NotNull()
    com.construction.application.data.network.api.ReportApi api, @org.jetbrains.annotations.NotNull()
    com.construction.application.data.db.AppDatabase db) {
        super();
    }
}