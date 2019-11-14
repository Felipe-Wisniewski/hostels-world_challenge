package com.example.hostelworld.repository

import com.example.hostelworld.model.Hostel
import com.example.hostelworld.model.HostelResponse
import io.reactivex.Observable

object HostelRepository : HostelRepoContract {

    private val retrofit = RetrofitApi.getRetrofit()

    override fun getHostels(term: String, callback: (Observable<HostelResponse>) -> Unit) {
        callback(retrofit.getListHostels())
    }

    override fun getHostelById(id: Long, callback: (Hostel?) -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}