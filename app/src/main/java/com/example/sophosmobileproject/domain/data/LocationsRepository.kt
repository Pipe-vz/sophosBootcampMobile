package com.example.sophosmobileproject.domain.data

import com.example.sophosmobileproject.domain.data.model.LocationsModel
import com.example.sophosmobileproject.domain.data.model.LocationsProvider
import com.example.sophosmobileproject.domain.data.network.MapsService

class LocationsRepository {
    private val api= MapsService()

    suspend fun getAllLocations(): LocationsModel?{
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