package com.example.hostelworld.ui.HostelList

import com.example.hostelworld.repository.HostelRepoContract
import java.sql.Struct

class HostelListPresenter(private val listView: HostelListView, private val repository: HostelRepoContract) {

    fun getHostels(term: String) {
        repository.getHostels(term) { hostels ->
            listView.showHostels(hostels)
        }
    }

    fun getHostel(id: Long) {

    }
}