package com.example.sophosmobileproject.domain.data.network

import com.example.sophosmobileproject.core.RetrofitHelper
import com.example.sophosmobileproject.domain.data.model.DocumentsModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DocumentsService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getDocuments():List<DocumentsModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(SophosApiClient::class.java).getAllDocuments()
            response.body() ?: emptyList()
        }
    }
}