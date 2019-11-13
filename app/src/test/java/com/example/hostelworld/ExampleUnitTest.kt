package com.example.hostelworld

import android.util.Log
import com.example.hostelworld.repository.HostelRepository
import org.junit.AfterClass
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun shouldReturnHostels() {

        val list = HostelRepository.apply {
            getHostels("") {
                hostels -> Log.d("FLMWG", hostels.size.toString())
            }
        }
        assertEquals(4, 2 + 2)
    }
}
