package com.example.hostelworld.ui.HostelList

import com.example.hostelworld.repository.HostelRepoContract

class HostelListPresenter(private val listView: HostelListView, private val repository: HostelRepoContract) {


    fun getHostels(term: String) {
        repository.getHostels(term) { response ->
            listView.showHostels(response)
        }
    }

    fun getHostel(id: Long) {

    }
}