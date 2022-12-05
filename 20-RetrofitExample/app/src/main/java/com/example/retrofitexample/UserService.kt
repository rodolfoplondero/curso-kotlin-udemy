package com.example.retrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface UserService {

    @GET("users")
    fun list(): Call<List<UserEntity>>

}