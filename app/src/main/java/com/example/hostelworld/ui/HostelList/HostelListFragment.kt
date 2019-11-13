package com.example.hostelworld.ui.HostelList

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.hostelworld.R
import com.example.hostelworld.model.Hostel
import com.example.hostelworld.repository.HostelRepository


class HostelListFragment : Fragment(), HostelListView {

    private val presenter = HostelListPresenter(this, HostelRepository)
    private var listener: OnFragmentInteractionListener? = null

    companion object {
        fun newInstance(param1: String, param2: String) =
            HostelListFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hostel_list, container, false)
    }

    override fun showHostels(hostels: List<Hostel>) {
        Log.d("FLMWG", hostels.size.toString())
    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }
}
