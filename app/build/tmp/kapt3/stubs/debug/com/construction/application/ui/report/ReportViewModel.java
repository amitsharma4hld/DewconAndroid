package com.construction.application.ui.report;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 Jl\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020#J.\u00100\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u00101\u001a\u00020 J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J!\u00106\u001a\u0002032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00107\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0011\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/construction/application/ui/report/ReportViewModel;", "Lcom/construction/application/ui/base/BaseViewModel;", "repository", "Lcom/construction/application/data/repository/ReportRepository;", "(Lcom/construction/application/data/repository/ReportRepository;)V", "_policeBackupResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/construction/application/data/network/Resource;", "Lcom/construction/application/data/responses/PoliceBackupResponse;", "_policeBackupSyncStatus", "Lcom/construction/application/data/db/entities/PoliceBackupEntity;", "_searchResponse", "Lcom/construction/application/data/responses/SearchResponse;", "_serviceLineResponse", "Lcom/construction/application/data/responses/ServiceLineResponse;", "allNotes", "Landroidx/lifecycle/LiveData;", "", "callSearchResponse", "getCallSearchResponse", "()Landroidx/lifecycle/LiveData;", "policeBackupResponse", "getPoliceBackupResponse", "serviceLineResponse", "getServiceLineResponse", "getPoliceBackupSyncStatusModel", "isSynced", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchResult", "Lkotlinx/coroutines/Job;", "char", "", "insertPoliceBackupReport", "crew_leader", "Lokhttp3/RequestBody;", "date", "work_address", "work_order_number", "officer_name", "police_department", "hours_worked", "is_car_used", "police_sheet_img_one", "Lokhttp3/MultipartBody$Part;", "police_sheet_img_two", "police_sheet_img_three", "localId", "insertServiceLineReport", "enter_town", "savePoliceBackupData", "", "policeBackupEntity", "(Lcom/construction/application/data/db/entities/PoliceBackupEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePoliceBackupSyncStatus", "localRegId", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ReportViewModel extends com.construction.application.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.construction.application.data.network.Resource<com.construction.application.data.responses.ServiceLineResponse>> _serviceLineResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.construction.application.data.network.Resource<com.construction.application.data.responses.SearchResponse>> _searchResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.construction.application.data.network.Resource<com.construction.application.data.responses.PoliceBackupResponse>> _policeBackupResponse = null;
    private androidx.lifecycle.MutableLiveData<com.construction.application.data.network.Resource<com.construction.application.data.db.entities.PoliceBackupEntity>> _policeBackupSyncStatus;
    private final androidx.lifecycle.LiveData<java.util.List<com.construction.application.data.db.entities.PoliceBackupEntity>> allNotes = null;
    private final com.construction.application.data.repository.ReportRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.construction.application.data.network.Resource<com.construction.application.data.responses.ServiceLineResponse>> getServiceLineResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertServiceLineReport(@org.jetbrains.annotations.NotNull()
    java.lang.String crew_leader, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String work_address, @org.jetbrains.annotations.NotNull()
    java.lang.String work_order_number, @org.jetbrains.annotations.NotNull()
    java.lang.String enter_town) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.construction.application.data.network.Resource<com.construction.application.data.responses.PoliceBackupResponse>> getPoliceBackupResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertPoliceBackupReport(@org.jetbrains.annotations.NotNull()
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
    okhttp3.RequestBody localId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.construction.application.data.network.Resource<com.construction.application.data.responses.SearchResponse>> getCallSearchResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getSearchResult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0_1526187) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object savePoliceBackupData(@org.jetbrains.annotations.NotNull()
    com.construction.application.data.db.entities.PoliceBackupEntity policeBackupEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePoliceBackupSyncStatus(boolean isSynced, @org.jetbrains.annotations.NotNull()
    java.lang.String localRegId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPoliceBackupSyncStatusModel(boolean isSynced, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.construction.application.data.db.entities.PoliceBackupEntity>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ReportViewModel(@org.jetbrains.annotations.NotNull()
    com.construction.application.data.repository.ReportRepository repository) {
        super(null);
    }
}