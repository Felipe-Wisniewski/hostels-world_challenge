package com.example.hostelworld.ui.HostelList

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hostelworld.R
import com.example.hostelworld.model.Hostel
import com.example.hostelworld.model.HostelResponse
import com.example.hostelworld.repository.HostelRepository
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.fragment_hostel_list.*

class HostelListFragment : Fragment(), HostelListView {

    private val presenter = HostelListPresenter(this, HostelRepository)
    private var hostels = mutableListOf<Hostel>()
    private var adapter = HostelListAdapter(hostels, this::onHostelItemClick)

    companion object {
        const val TAG_HOSTELS = "tagHostels"
        fun newInstance(param1: String) = HostelListFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_hostel_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getHostels("")
        initRecyclerView()
    }

    private fun initRecyclerView() {
        rvHostels.adapter = adapter

        val layoutInflater = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        rvHostels.layoutManager = layoutInflater
    }

    override fun showHostels(hostels: Observable<HostelResponse>) {
        val disposable = hostels
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                response ->
                    this.hostels.addAll(response.properties)
                    adapter.notifyDataSetChanged()
            },{
                error -> Log.e("FLMWG", error.toString())
            })
    }

    private fun onHostelItemClick(hostel: Hostel) {
        Log.d("FLMWG", "onHostelItemClick - ${hostel.name}")
    }
}
