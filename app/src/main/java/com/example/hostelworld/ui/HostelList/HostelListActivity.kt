
package com.example.hostelworld.ui.HostelList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hostelworld.R

class HostelListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hostel_list)

        if (savedInstanceState == null) {
            showHostelListFragment()
        }
    }

    private fun showHostelListFragment() {
        val fragment = HostelListFragment.newInstance("termo de pesquisa")

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flHostelList, fragment, HostelListFragment.TAG_HOSTELS)
            .commit()
    }
}
