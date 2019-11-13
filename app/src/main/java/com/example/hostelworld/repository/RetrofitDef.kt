package com.example.hostelworld.repository

import com.example.hostelworld.model.HostelResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface RetrofitDef {
    @GET("/")
    fun getListHostels() : Observable<HostelResponse>
}