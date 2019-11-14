package com.example.hostelworld.repository

import com.example.hostelworld.model.Hostel
import com.example.hostelworld.model.HostelResponse
import io.reactivex.Observable

interface HostelRepoContract {
    fun getHostels(term: String, callback: (Observable<HostelResponse>) -> Unit)
    fun getHostelById(id: Long, callback: (Hostel?) -> Unit)
}