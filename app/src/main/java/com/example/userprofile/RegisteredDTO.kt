package com.example.userprofile

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RegisteredDTO(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
)