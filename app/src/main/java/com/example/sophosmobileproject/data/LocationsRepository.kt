package com.example.sophosmobileproject.data

import com.example.sophosmobileproject.data.model.LocationsModel
import com.example.sophosmobileproject.data.model.LocationsProvider
import com.example.sophosmobileproject.data.network.MapsService

class LocationsRepository {
    private val api= MapsService()

    suspend fun getAllLocations():LocationsModel?{
        val response = api.getLocations()
        LocationsProvider.locations = response
        if (response!=null){
            println("Empty")
        }else{
            println("${response}response.")
        }

        return response
    }
}