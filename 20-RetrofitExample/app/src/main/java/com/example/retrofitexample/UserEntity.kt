package com.example.retrofitexample

import com.google.gson.annotations.SerializedName

class UserEntity {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

}