package com.example.sophosmobileproject.data

import com.example.sophosmobileproject.data.model.DocumentsModel
import com.example.sophosmobileproject.data.model.DocumentsProvider
import com.example.sophosmobileproject.data.network.DocumentsService

class DocumentsRepository {

    private val api=DocumentsService()

    suspend fun getAllDocuments():List<DocumentsModel>{
        val response = api.getDocuments()
        DocumentsProvider.documents = response
        return response
    }
}