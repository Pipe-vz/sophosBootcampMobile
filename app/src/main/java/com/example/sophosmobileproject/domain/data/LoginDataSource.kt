package com.example.sophosmobileproject.domain.data

import com.example.sophosmobileproject.domain.data.model.LoggedInUser
import com.example.sophosmobileproject.domain.data.model.LoggedInfoUser
import com.example.sophosmobileproject.domain.data.network.LogInService
import java.io.IOException

/**
* Class that handles authentication w/ login credentials and retrieves user information.
*/
class LoginDataSource {

    private val api = LogInService()

    suspend fun login(username: String, password: String): Result<LoggedInUser> {

        return try {
            val loggedUser = getLoggedIn(username, password)
            if ((loggedUser != null) && loggedUser.acceso) {
                val userData = LoggedInUser(loggedUser.displayName, loggedUser.apellido)
                println("success\n")
                Result.Success(userData)
            }else {
                println("Error tray\n")
                Result.Error(IOException("Error logging in"))
            }
        } catch (e: Throwable) {
            println("Error Catch internet\n")
            return Result.Error(IOException("Error logging in", e))
        }
    }

    private suspend fun getLoggedIn(username: String, password: String): LoggedInfoUser? {
        return api.getLogIn(username, password)
    }

    fun logout() {
        // TODO: revoke authentication
    }
}