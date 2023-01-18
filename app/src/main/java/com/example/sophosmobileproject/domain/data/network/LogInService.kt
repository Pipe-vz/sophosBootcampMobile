package com.example.sophosmobileproject.domain.data.network

import com.example.sophosmobileproject.core.RetrofitHelper
import com.example.sophosmobileproject.domain.data.model.LoggedInfoUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LogInService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getLogIn(idUsuario:String, clave:String): LoggedInfoUser? {
        return withContext(Dispatchers.IO) {
            println("Service before,${idUsuario},${clave}\n")
            val response = retrofit.create(SophosApiClient::class.java).getLogIn(idUsuario, clave)
            println("Service after\n")
            response.body()
        }
    }
}
