package com.example.sophosmobileproject.domain.data.network

import com.example.sophosmobileproject.domain.data.model.DocumentsModel
import com.example.sophosmobileproject.domain.data.model.LocationsModel
import com.example.sophosmobileproject.domain.data.model.LoggedInfoUser
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface SophosApiClient {
    @GET("/.json")
    suspend fun getAllDocuments():Response<List<DocumentsModel>>

    //    TODO: Agregar correo de inicio de sesión a URL para cargar documentos

    //@GET("/RS_Documentos/$email")
    //suspend fun getAllDocuments():Response<List<DocumentsModel>>

    //@GET("/RS_Documentos/$id")
    //suspend fun getAllDocuments():Response<List<DocumentsModel>>

    @GET("/RS_Usuarios")
    suspend fun getLogIn(
        @Query("idUsuario") idUsuario: String?,
        @Query("clave") clave: String?,
    ): Response<LoggedInfoUser>

    @GET("/RS_Oficinas")
    suspend fun getAllLocations():Response<LocationsModel>


}
