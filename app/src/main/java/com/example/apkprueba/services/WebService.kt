package com.example.apkprueba.services

import com.example.apkprueba.Model.Devices
import retrofit2.Call
import retrofit2.http.GET

interface WebService {

    @GET("/devices")
    fun getDevices(): Call<GetDevices>

    data class GetDevices(val devices: ArrayList<Devices>)
}