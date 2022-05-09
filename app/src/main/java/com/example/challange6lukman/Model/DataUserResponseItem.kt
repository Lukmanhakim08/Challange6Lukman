package com.example.challange6lukman.Model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataUserResponseItem(
    @SerializedName("address")
    val address: String,
    @SerializedName("dateofbirth")
    val dateofbirth: String,
    @SerializedName("fullname")
    val fullname: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("umur")
    val umur: Int,
    @SerializedName("username")
    val username: String
): Parcelable