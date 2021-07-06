package com.construction.application.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0016\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\fH\u0002Jn\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00062"}, d2 = {"Lcom/construction/application/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/construction/application/data/network/UploadRequestBody$UploadCallback;", "()V", "binding", "Lcom/construction/application/databinding/FragmentHomeBinding;", "isInProcess", "", "()Z", "setInProcess", "(Z)V", "policeBackupEntityList", "", "Lcom/construction/application/data/db/entities/PoliceBackupEntity;", "viewModel", "Lcom/construction/application/ui/report/ReportViewModel;", "getViewModel", "()Lcom/construction/application/ui/report/ReportViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onProgressUpdate", "", "percentage", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupMenuItems", "setupSearchAutoSuggestions", "showMenus", "menusList", "Lcom/construction/application/data/HomeMenu;", "submitReportOnline", "crewLeader", "", "date", "workAddress", "workOrderNumber", "officerName", "policeDepartment", "hoursWorked", "isCarUsedRadioString", "policeSheetOneByteArray", "", "policeSheetTwoByteArray", "policeSheetThreeByteArray", "localId", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.construction.application.data.network.UploadRequestBody.UploadCallback {
    private com.construction.application.databinding.FragmentHomeBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.List<com.construction.application.data.db.entities.PoliceBackupEntity> policeBackupEntityList;
    private boolean isInProcess = false;
    private java.util.HashMap _$_findViewCache;
    
    private final com.construction.application.ui.report.ReportViewModel getViewModel() {
        return null;
    }
    
    public final boolean isInProcess() {
        return false;
    }
    
    public final void setInProcess(boolean p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupMenuItems() {
    }
    
    private final void setupSearchAutoSuggestions() {
    }
    
    private final void showMenus(java.util.List<com.construction.application.data.HomeMenu> menusList) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void submitReportOnline(java.lang.String crewLeader, java.lang.String date, java.lang.String workAddress, java.lang.String workOrderNumber, java.lang.String officerName, java.lang.String policeDepartment, java.lang.String hoursWorked, java.lang.String isCarUsedRadioString, byte[] policeSheetOneByteArray, byte[] policeSheetTwoByteArray, byte[] policeSheetThreeByteArray, java.lang.String localId) {
    }
    
    @java.lang.Override()
    public void onProgressUpdate(int percentage) {
    }
    
    public HomeFragment() {
        super();
    }
}