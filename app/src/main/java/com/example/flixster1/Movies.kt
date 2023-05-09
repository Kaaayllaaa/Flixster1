package com.example.flixster1
import com.google.gson.annotations.SerializedName
class Movies
{
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var bookImageUrl: String? = null
}