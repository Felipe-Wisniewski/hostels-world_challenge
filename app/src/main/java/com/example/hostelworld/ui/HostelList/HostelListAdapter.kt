package com.example.hostelworld.ui.HostelList

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hostelworld.model.Hostel

class HostelListAdapter(private val hostels: List<Hostel>) : RecyclerView.Adapter<HostelListAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView)  {

    }
}