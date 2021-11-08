package com.example.userprofile.models.remote.requests

import com.google.gson.annotations.SerializedName

data class LocationDTO(

    @field:SerializedName("street")
	val street: StreetDTO? = null,

    @field:SerializedName("city")
	val city: String? = null,

    @field:SerializedName("state")
	val state: String? = null,

    @field:SerializedName("country")
	val country: String? = null,

    @field:SerializedName("postcode")
	val postcode: String? = null,

    @field:SerializedName("coordinates")
	val coordinates: CoordinatesDTO? = null,

    @field:SerializedName("timezone")
	val timezone: TimezoneDTO? = null
)