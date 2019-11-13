package com.example.hostelworld.repository

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApi {

    companion object {
        private val url = "https://gist.githubusercontent.com/dovdtel87/ef6dd1422a86554d22172e5975222f81/raw/ba5b81b567efebc1039a481b7e9712b7cd61ea6c"

        fun getRetrofit() : RetrofitDef {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            val httpClient = OkHttpClient.Builder()
            httpClient.addInterceptor(logging)

            val gson = GsonBuilder().setLenient().create()

            val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient.build())
                .build()

            return retrofit.create<RetrofitDef>(RetrofitDef::class.java)
        }
    }
}