package com.construction.application.data.responses

class SearchResponse : ArrayList<SearchResponse.SearchResponseItem>(){
    data class SearchResponseItem(
        val Activity: String,
        val Activity_Note: String,
        val Actual__Date: String,
        val Assignment_Status: String,
        val Authorized_By: String,
        val Contractor__Start_Date: String,
        val Cost_Code: String,
        val Date_Released_: String,
        val Department1: String,
        val Equipment: String,
        val Equipment_Description: String,
        val Invoice_Date: String,
        val Invoice_Number: String,
        val Location: String,
        val Location_Description: String,
        val New_Business_Request_Number: String,
        val Priority_Icon: String,
        val Released_By: String,
        val Status: String,
        val Supplier: String,
        val Supplier_Description: String,
        val Task_Plan: String,
        val Task_Plan_Description: String,
        val Work_Address: String,
        val Work_Order: String,
        val Work_Order_Description: String,
        val id: Int
    )
}