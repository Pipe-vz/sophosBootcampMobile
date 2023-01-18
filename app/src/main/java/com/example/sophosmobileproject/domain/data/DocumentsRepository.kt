package com.example.sophosmobileproject.domain.data

import com.example.sophosmobileproject.domain.data.model.DocumentsModel
import com.example.sophosmobileproject.domain.data.model.DocumentsProvider
import com.example.sophosmobileproject.domain.data.network.DocumentsService

class DocumentsRepository {

    private val api= DocumentsService()

    suspend fun getAllDocuments():List<DocumentsModel>{
        val response = api.getDocuments()
        DocumentsProvider.documents = response
        return response
    }
}