package com.construction.application.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Blob


@Entity
data class PoliceBackupEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var crew_leader: String,
    var date: String,
    var work_address: String,
    var work_order_number: String,
    var officer_name: String,
    var police_department: String,
    var hours_worked: String,
    var is_car_used: String,
    @ColumnInfo(name = "image",typeAffinity = ColumnInfo.BLOB)
    var police_sheet_img_one: ByteArray?,
    var police_sheet_img_two: ByteArray?,
    var police_sheet_img_three: ByteArray?,
    var delivery_status: Int,
    var registration_id:String,
    var synced: Boolean? = false
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PoliceBackupEntity

        if (!police_sheet_img_one.contentEquals(other.police_sheet_img_one)) return false
        if (!police_sheet_img_two.contentEquals(other.police_sheet_img_two)) return false
        if (!police_sheet_img_three.contentEquals(other.police_sheet_img_three)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = police_sheet_img_one.contentHashCode()
        result = 31 * result + police_sheet_img_two.contentHashCode()
        result = 31 * result + police_sheet_img_three.contentHashCode()
        return result
    }
}

