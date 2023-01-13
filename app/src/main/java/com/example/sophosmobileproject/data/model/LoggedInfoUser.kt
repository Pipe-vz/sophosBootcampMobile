package com.example.sophosmobileproject.data.model

import com.google.gson.annotations.SerializedName

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInfoUser(
//    @SerializedName("id") val userId: String,
    @SerializedName("nombre") val displayName: String,
    @SerializedName("apellido") val apellido: String,
    @SerializedName("acceso") val acceso: Boolean,
//    @SerializedName("") val admin: Boolean
)