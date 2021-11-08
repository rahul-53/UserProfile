package com.example.userprofile.models.remote.requests

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PictureDTO(

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null
)