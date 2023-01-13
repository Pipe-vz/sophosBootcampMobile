package com.example.sophosmobileproject.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sophosmobileproject.data.model.DocumentsModel
import com.example.sophosmobileproject.domain.GetDocumentsUseCase
import kotlinx.coroutines.launch

class DocumentsViewModel: ViewModel() {

    val documentsModel = MutableLiveData<DocumentsModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getDocumentsUseCase = GetDocumentsUseCase()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getDocumentsUseCase()

            if(!result.isNullOrEmpty()){
                documentsModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }


}