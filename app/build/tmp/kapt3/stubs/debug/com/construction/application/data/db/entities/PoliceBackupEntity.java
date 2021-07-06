package com.construction.application.data.db.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00103J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\u00ac\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010N\u001a\u00020\u0003H\u0016J\t\u0010O\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b\'\u0010\u0019R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019\u00a8\u0006P"}, d2 = {"Lcom/construction/application/data/db/entities/PoliceBackupEntity;", "", "id", "", "crew_leader", "", "date", "work_address", "work_order_number", "officer_name", "police_department", "hours_worked", "is_car_used", "police_sheet_img_one", "", "police_sheet_img_two", "police_sheet_img_three", "delivery_status", "registration_id", "synced", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B[B[BILjava/lang/String;Ljava/lang/Boolean;)V", "getCrew_leader", "()Ljava/lang/String;", "setCrew_leader", "(Ljava/lang/String;)V", "getDate", "setDate", "getDelivery_status", "()I", "setDelivery_status", "(I)V", "getHours_worked", "setHours_worked", "getId", "set_car_used", "getOfficer_name", "setOfficer_name", "getPolice_department", "setPolice_department", "getPolice_sheet_img_one", "()[B", "setPolice_sheet_img_one", "([B)V", "getPolice_sheet_img_three", "setPolice_sheet_img_three", "getPolice_sheet_img_two", "setPolice_sheet_img_two", "getRegistration_id", "setRegistration_id", "getSynced", "()Ljava/lang/Boolean;", "setSynced", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWork_address", "setWork_address", "getWork_order_number", "setWork_order_number", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B[B[BILjava/lang/String;Ljava/lang/Boolean;)Lcom/construction/application/data/db/entities/PoliceBackupEntity;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class PoliceBackupEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String crew_leader;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String work_address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String work_order_number;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String officer_name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String police_department;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hours_worked;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String is_car_used;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "image", typeAffinity = androidx.room.ColumnInfo.BLOB)
    private byte[] police_sheet_img_one;
    @org.jetbrains.annotations.Nullable()
    private byte[] police_sheet_img_two;
    @org.jetbrains.annotations.Nullable()
    private byte[] police_sheet_img_three;
    private int delivery_status;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String registration_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean synced;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCrew_leader() {
        return null;
    }
    
    public final void setCrew_leader(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWork_address() {
        return null;
    }
    
    public final void setWork_address(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWork_order_number() {
        return null;
    }
    
    public final void setWork_order_number(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOfficer_name() {
        return null;
    }
    
    public final void setOfficer_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPolice_department() {
        return null;
    }
    
    public final void setPolice_department(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHours_worked() {
        return null;
    }
    
    public final void setHours_worked(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String is_car_used() {
        return null;
    }
    
    public final void set_car_used(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getPolice_sheet_img_one() {
        return null;
    }
    
    public final void setPolice_sheet_img_one(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getPolice_sheet_img_two() {
        return null;
    }
    
    public final void setPolice_sheet_img_two(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getPolice_sheet_img_three() {
        return null;
    }
    
    public final void setPolice_sheet_img_three(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    public final int getDelivery_status() {
        return 0;
    }
    
    public final void setDelivery_status(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegistration_id() {
        return null;
    }
    
    public final void setRegistration_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSynced() {
        return null;
    }
    
    public final void setSynced(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public PoliceBackupEntity(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String crew_leader, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String work_address, @org.jetbrains.annotations.NotNull()
    java.lang.String work_order_number, @org.jetbrains.annotations.NotNull()
    java.lang.String officer_name, @org.jetbrains.annotations.NotNull()
    java.lang.String police_department, @org.jetbrains.annotations.NotNull()
    java.lang.String hours_worked, @org.jetbrains.annotations.NotNull()
    java.lang.String is_car_used, @org.jetbrains.annotations.Nullable()
    byte[] police_sheet_img_one, @org.jetbrains.annotations.Nullable()
    byte[] police_sheet_img_two, @org.jetbrains.annotations.Nullable()
    byte[] police_sheet_img_three, int delivery_status, @org.jetbrains.annotations.NotNull()
    java.lang.String registration_id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean synced) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.construction.application.data.db.entities.PoliceBackupEntity copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String crew_leader, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String work_address, @org.jetbrains.annotations.NotNull()
    java.lang.String work_order_number, @org.jetbrains.annotations.NotNull()
    java.lang.String officer_name, @org.jetbrains.annotations.NotNull()
    java.lang.String police_department, @org.jetbrains.annotations.NotNull()
    java.lang.String hours_worked, @org.jetbrains.annotations.NotNull()
    java.lang.String is_car_used, @org.jetbrains.annotations.Nullable()
    byte[] police_sheet_img_one, @org.jetbrains.annotations.Nullable()
    byte[] police_sheet_img_two, @org.jetbrains.annotations.Nullable()
    byte[] police_sheet_img_three, int delivery_status, @org.jetbrains.annotations.NotNull()
    java.lang.String registration_id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean synced) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}