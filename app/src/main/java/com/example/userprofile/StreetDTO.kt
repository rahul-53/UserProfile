package com.example.userprofile

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StreetDTO(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("name")
	val name: String? = null
)