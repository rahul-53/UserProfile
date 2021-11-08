package com.example.userprofile.models.remote.requests

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CoordinatesDTO(

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)