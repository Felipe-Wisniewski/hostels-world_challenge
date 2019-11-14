package com.example.hostelworld.repository

import com.example.hostelworld.model.HostelResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface RetrofitDef {
    @GET("/dovdtel87/ef6dd1422a86554d22172e5975222f81/raw/ba5b81b567efebc1039a481b7e9712b7cd61ea6c")
    fun getListHostels() : Observable<HostelResponse>
}