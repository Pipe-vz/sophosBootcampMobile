package com.example.sophosmobileproject.domain.data.model

/**
 * User details post authentication that is exposed to the UI
 */
data class LoggedInUserView(
    val displayName: String,
    val email:String
    //... other data fields that may be accessible to the UI
)