package com.example.hostelworld.repository

import com.example.hostelworld.model.Hostel

interface HostelRepoContract {
    fun getHostels(term: String, callback: (List<Hostel>) -> Unit)
    fun getHostelById(id: Long, callback: (Hostel?) -> Unit)
}