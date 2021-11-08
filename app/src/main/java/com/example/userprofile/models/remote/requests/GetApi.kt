package com.example.userprofile.models.remote.requests

import retrofit2.http.GET
import retrofit2.http.Path

interface GetApi {
    @GET("api")
    fun getUser()
}