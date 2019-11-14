package com.example.hostelworld.ui.HostelList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hostelworld.R
import com.example.hostelworld.model.Hostel
import kotlinx.android.synthetic.main.item_list_hostel.view.*

class HostelListAdapter(private val hostels: List<Hostel>, private val callback: (Hostel) -> Unit) : RecyclerView.Adapter<HostelListAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list_hostel, parent, false)

        val vh = VH(v)

        vh.itemView.setOnClickListener {
            val hostel = hostels[vh.adapterPosition]
            callback(hostel)
        }

        return vh
    }

    override fun getItemCount(): Int = hostels.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        val hostel = hostels[position]

        val name = hostel.name
        val desc = hostel.overview
        val objImg = hostel.images[0]
        val imgUrl = "${objImg.prefix}.${objImg.suffix}"
        val rating = hostel.overallRating.overall

        holder.txtHostelName.text = name
        holder.txtHostelDesc.text = desc
        holder.ratingHostel.rating = rating.toFloat()
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        val txtHostelName: TextView = itemView.txtHostelName
        val txtHostelDesc: TextView = itemView.txtHostelDesc
        val imgHostel: ImageView = itemView.thumbHostel
        val ratingHostel: RatingBar = itemView.rtbRating
    }
}