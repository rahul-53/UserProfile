package com.example.userprofile.models.remote.requests

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class InfoDTO(

	@field:SerializedName("seed")
	val seed: String? = null,

	@field:SerializedName("results")
	val results: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("version")
	val version: String? = null
)