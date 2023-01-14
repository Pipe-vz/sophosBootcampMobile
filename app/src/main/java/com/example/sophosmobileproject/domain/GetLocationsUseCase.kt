package com.example.sophosmobileproject.domain

import com.example.sophosmobileproject.data.LocationsRepository
import com.example.sophosmobileproject.data.model.LocationsModel

class GetLocationsUseCase {

    private val repository = LocationsRepository()

    suspend operator fun invoke():LocationsModel? = repository.getAllLocations()

}