package com.example.hostelworld.repository

import android.util.Log
import com.example.hostelworld.model.Hostel
import io.reactivex.disposables.CompositeDisposable

object HostelRepository : HostelRepoContract {

    private val retrofit = RetrofitApi.getRetrofit()
    private val disposable = CompositeDisposable()

    override fun getHostels(term: String, callback: (List<Hostel>) -> Unit) {
        disposable.add(retrofit.getListHostels()
            .subscribe({
                resp -> callback(resp.properties)
            }, {
                error -> Log.d("FLMWG", error.toString())
            }))
    }

    override fun getHostelById(id: Long, callback: (Hostel?) -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}