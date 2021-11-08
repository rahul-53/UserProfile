package com.example.userprofile.models.remote.responses

import com.example.userprofile.models.remote.requests.InfoDTO
import com.example.userprofile.models.remote.requests.ResultsDTO
import com.google.gson.annotations.SerializedName

data class ResponseDTO(

    @field:SerializedName("results")
	val results: List<ResultsDTO?>? = null,

    @field:SerializedName("info")
	val info: InfoDTO? = null
)