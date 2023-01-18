package com.example.sophosmobileproject.domain

import com.example.sophosmobileproject.domain.data.DocumentsRepository
import com.example.sophosmobileproject.domain.data.model.DocumentsModel

class GetDocumentsUseCase {

    private val repository = DocumentsRepository()

    suspend operator fun invoke():List<DocumentsModel>? = repository.getAllDocuments()

}