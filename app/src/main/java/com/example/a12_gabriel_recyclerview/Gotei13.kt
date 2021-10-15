package com.example.a12_gabriel_recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Gotei13(
    val imgGotei13: Int,
    val nameGotei13: String,
    val descGotei13: String,
) : Parcelable
