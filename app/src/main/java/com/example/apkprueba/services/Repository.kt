package com.example.apkprueba.services

import retrofit2.Callback

class Repository(

    private val webServices: WebService)

{

    fun requestDevices(callback: Callback<WebService.GetDevices>) {
        webServices.getDevices().enqueue(callback)
    }
}
