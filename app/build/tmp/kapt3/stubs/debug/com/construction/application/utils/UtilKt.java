package com.construction.application.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00aa\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010\u001a \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u001a\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019\u001a\n\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\u0016\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#\u001a\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0001\u001a\u0006\u0010\'\u001a\u00020%\u001a\u0010\u0010(\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a\u0012\u0010)\u001a\u00020\b*\u00020*2\u0006\u0010+\u001a\u00020,\u001a\u0012\u0010-\u001a\u00020\b*\u00020*2\u0006\u0010.\u001a\u00020%\u001a\u0012\u0010/\u001a\u00020\u0001*\u0002002\u0006\u00101\u001a\u00020\u001c\u001a$\u00102\u001a\u00020\b*\u0002032\u0006\u00104\u001a\u0002052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u000107\u001a\f\u00108\u001a\u00020%*\u0004\u0018\u000109\u001a(\u0010:\u001a\u00020\b*\u00020*2\b\b\u0002\u0010;\u001a\u00020<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0>\u001a\u001a\u0010?\u001a\u00020\b*\u00020*2\u0006\u0010.\u001a\u00020%2\u0006\u0010@\u001a\u00020A\u001a$\u0010B\u001a\u00020\b*\u00020*2\u0006\u0010C\u001a\u00020\u00012\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u000107\u001a\u0012\u0010E\u001a\u00020\b*\u00020*2\u0006\u0010F\u001a\u00020%\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006G"}, d2 = {"TAG", "", "homeMenu", "", "Lcom/construction/application/data/HomeMenu;", "getHomeMenu", "()Ljava/util/List;", "basicAlert", "", "context", "Landroid/content/Context;", "positiveButtonClick", "Landroid/content/DialogInterface$OnClickListener;", "negativeButtonClick", "neutralButtonClick", "convertBitMapToBytArray", "", "bitmap", "Landroid/graphics/Bitmap;", "convertBytArrayToBitMap", "byteArray", "convertByteArrayToFile", "Ljava/io/File;", "fileName", "activity", "Landroid/app/Activity;", "createImageFileRequestBody", "imageFilePathUri", "Landroid/net/Uri;", "generateFileNameInMilliSec", "generateGUID", "length", "", "getDatePickerDialog", "policeBackupFragment", "Lcom/construction/application/ui/fragments/policebackup/PoliceBackupFragment;", "isFieldNotEmpty", "", "field", "isInternetConnected", "randomString", "TextWatcher", "Landroid/view/View;", "textInputEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "enable", "enabled", "getFileName", "Landroid/content/ContentResolver;", "fileUri", "handleApiError", "Landroidx/fragment/app/Fragment;", "failure", "Lcom/construction/application/data/network/Resource$Failure;", "retry", "Lkotlin/Function0;", "isNull", "", "onThrottledClick", "throttleDelay", "", "onClick", "Lkotlin/Function1;", "setEnabledRecursively", "window", "Landroid/view/Window;", "snackbar", "message", "action", "visible", "isVisible", "app_debug"})
public final class UtilKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.construction.application.data.HomeMenu> homeMenu = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AppDebug";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.construction.application.data.HomeMenu> getHomeMenu() {
        return null;
    }
    
    public static final void visible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$visible, boolean isVisible) {
    }
    
    public static final void basicAlert(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener positiveButtonClick, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener negativeButtonClick, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener neutralButtonClick) {
    }
    
    public static final boolean isInternetConnected() {
        return false;
    }
    
    public static final void enable(@org.jetbrains.annotations.NotNull()
    android.view.View $this$enable, boolean enabled) {
    }
    
    public static final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void setEnabledRecursively(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setEnabledRecursively, boolean enabled, @org.jetbrains.annotations.NotNull()
    android.view.Window window) {
    }
    
    public static final void getDatePickerDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.construction.application.ui.fragments.policebackup.PoliceBackupFragment policeBackupFragment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String generateGUID(int length) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String generateFileNameInMilliSec() {
        return null;
    }
    
    private static final java.lang.String randomString(int length) {
        return null;
    }
    
    public static final boolean isFieldNotEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return false;
    }
    
    public static final void onThrottledClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$onThrottledClick, long throttleDelay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onClick) {
    }
    
    public static final void TextWatcher(@org.jetbrains.annotations.NotNull()
    android.view.View $this$TextWatcher, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText textInputEditText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver $this$getFileName, @org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File createImageFileRequestBody(@org.jetbrains.annotations.NotNull()
    android.net.Uri imageFilePathUri, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File convertByteArrayToFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    byte[] byteArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final byte[] convertBitMapToBytArray(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap convertBytArrayToBitMap(@org.jetbrains.annotations.NotNull()
    byte[] byteArray) {
        return null;
    }
    
    public static final boolean isNull(@org.jetbrains.annotations.Nullable()
    java.lang.Object $this$isNull) {
        return false;
    }
    
    public static final void handleApiError(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$handleApiError, @org.jetbrains.annotations.NotNull()
    com.construction.application.data.network.Resource.Failure failure, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
    }
}