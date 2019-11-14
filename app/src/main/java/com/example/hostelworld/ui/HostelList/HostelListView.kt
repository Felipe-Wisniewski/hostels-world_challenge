package com.example.hostelworld.ui.HostelList

import com.example.hostelworld.model.HostelResponse
import io.reactivex.Observable

interface HostelListView {
    fun showHostels(hostelResponse: Observable<HostelResponse>)
}