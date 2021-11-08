package com.example.userprofile

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseDTO(

	@field:SerializedName("results")
	val results: List<ResultsDTO?>? = null,

	@field:SerializedName("info")
	val info: InfoDTO? = null
)