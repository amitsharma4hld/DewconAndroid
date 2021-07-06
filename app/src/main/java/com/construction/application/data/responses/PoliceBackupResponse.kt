package com.construction.application.data.responses

data class PoliceBackupResponse(
    val Item1: Int,
    val Item2: String,
    val Item3: Item
) {
    data class Item(
        val CrewLeader: String,
        val Date: String,
        val HoursWorked: String,
        val OfficerName: String,
        val PoliceBackup_Id: Int,
        val PoliceDepartment: String,
        val UPloadImage1: String,
        val UPloadImage2: String,
        val UPloadImage3: String,
        val WorkAddress: String,
        val WorkOrderNumber: String,
        val car: Boolean,
        val DateTime: String,
        val Remark: String,
        val LocalId: String
    )
}