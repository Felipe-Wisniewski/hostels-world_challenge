package com.example.hostelworld.ui.HostelList

import com.example.hostelworld.model.Hostel

interface HostelListView {
    fun showHostels(hostels: List<Hostel>)
}