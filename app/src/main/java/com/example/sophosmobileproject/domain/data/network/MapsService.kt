package com.example.sophosmobileproject.domain.data.network

import com.example.sophosmobileproject.core.RetrofitHelper
import com.example.sophosmobileproject.domain.data.model.LocationsModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MapsService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getLocations(): LocationsModel?{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(SophosApiClient::class.java).getAllLocations()
            response.body()
        }
    }
}