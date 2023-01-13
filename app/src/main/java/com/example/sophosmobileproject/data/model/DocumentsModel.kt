package com.example.sophosmobileproject.data.model

import com.google.gson.annotations.SerializedName

data class DocumentsModel(
//    val IdRegistro:String,
//    val Fecha:String,
//    val TipoAdjunto:String,
//    val Nombre:String,
//    val Apellido:String)
    //todo: de prueba, borrar
    @SerializedName("quote") val Nombre: String,
    @SerializedName("author") val Apellido: String
)
