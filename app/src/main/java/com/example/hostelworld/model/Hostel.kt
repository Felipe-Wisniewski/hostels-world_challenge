package com.example.hostelworld.model

data class HostelResponse(
    val properties: List<Hostel>
)

data class Hostel(
    val id: Long,
    val name: String,
    val overview: String,
    val latitude: Float,
    val longitude: Float,
    val overallRating: OverallRating,
    val lowestPricePerNight: LowestPricePerNight,
    val images: List<ImagensHostel>
)

data class OverallRating(
    val overall: Int,
    val numberOfRatings: String
)

data class LowestPricePerNight(
    val value: String,
    val currency: String
)

data class ImagensHostel(
    val prefix: String,
    val suffix: String
)

