package com.example.sophosmobileproject.data.model

import com.google.gson.annotations.SerializedName

data class LocationsModel(
    @SerializedName("Items") val items: ArrayList<LocationDetailModel>,
//    @SerializedName("Count") val count: Long,
//    @SerializedName("ScannedCount") val scannedCount: Long
)

data class LocationDetailModel(
    @SerializedName("ciudad") val ciudad: String,
    @SerializedName("Longitud") val longitud: String,
    @SerializedName("IdOficina") val idOficina: Long,
    @SerializedName("Latitud") val latitud: String,
    @SerializedName("Nombre") val nombre: String
)