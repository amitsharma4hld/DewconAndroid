package com.construction.application.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0003\u0010\u0011\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/construction/application/data/network/UploadRequestBody;", "Lokhttp3/RequestBody;", "file", "Ljava/io/File;", "contentType", "", "callback", "Lcom/construction/application/data/network/UploadRequestBody$UploadCallback;", "(Ljava/io/File;Ljava/lang/String;Lcom/construction/application/data/network/UploadRequestBody$UploadCallback;)V", "contentLength", "", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "ProgressUpdater", "UploadCallback", "app_debug"})
public final class UploadRequestBody extends okhttp3.RequestBody {
    private final java.io.File file = null;
    private final java.lang.String contentType = null;
    private final com.construction.application.data.network.UploadRequestBody.UploadCallback callback = null;
    private static final int DEFAULT_BUFFER_SIZE = 2048;
    @org.jetbrains.annotations.NotNull()
    public static final com.construction.application.data.network.UploadRequestBody.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public long contentLength() {
        return 0L;
    }
    
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) {
    }
    
    public UploadRequestBody(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    com.construction.application.data.network.UploadRequestBody.UploadCallback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/construction/application/data/network/UploadRequestBody$UploadCallback;", "", "onProgressUpdate", "", "percentage", "", "app_debug"})
    public static abstract interface UploadCallback {
        
        public abstract void onProgressUpdate(int percentage);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/construction/application/data/network/UploadRequestBody$ProgressUpdater;", "Ljava/lang/Runnable;", "uploaded", "", "total", "(Lcom/construction/application/data/network/UploadRequestBody;JJ)V", "run", "", "app_debug"})
    public final class ProgressUpdater implements java.lang.Runnable {
        private final long uploaded = 0L;
        private final long total = 0L;
        
        @java.lang.Override()
        public void run() {
        }
        
        public ProgressUpdater(long uploaded, long total) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/construction/application/data/network/UploadRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}