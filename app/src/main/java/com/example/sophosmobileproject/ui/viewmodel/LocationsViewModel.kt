package com.example.sophosmobileproject.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sophosmobileproject.domain.data.model.LocationsModel
import com.example.sophosmobileproject.domain.GetLocationsUseCase
import kotlinx.coroutines.launch

class LocationsViewModel: ViewModel() {

    val documentsModel = MutableLiveData<LocationsModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getLocationsUseCase = GetLocationsUseCase()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getLocationsUseCase()

//            if(!result.isNullOrEmpty()){
//                LocationsModel.postValue(result)
//                isLoading.postValue(false)

//            }
        }
    }


}