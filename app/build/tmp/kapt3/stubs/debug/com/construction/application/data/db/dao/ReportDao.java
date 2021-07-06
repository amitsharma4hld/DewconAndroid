package com.construction.application.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/construction/application/data/db/dao/ReportDao;", "", "getPoliceBackupOfflineData", "", "Lcom/construction/application/data/db/entities/PoliceBackupEntity;", "isSync", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPoliceBackupToRoomDb", "", "policeBackupEntity", "(Lcom/construction/application/data/db/entities/PoliceBackupEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSyncStatus", "isSynced", "localId", "", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ReportDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertPoliceBackupToRoomDb(@org.jetbrains.annotations.NotNull()
    com.construction.application.data.db.entities.PoliceBackupEntity policeBackupEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT *  FROM PoliceBackupEntity  WHERE synced=:isSync")
    public abstract java.lang.Object getPoliceBackupOfflineData(boolean isSync, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.construction.application.data.db.entities.PoliceBackupEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE PoliceBackupEntity SET synced=:isSynced WHERE registration_id=:localId")
    public abstract java.lang.Object updateSyncStatus(boolean isSynced, @org.jetbrains.annotations.NotNull()
    java.lang.String localId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
}