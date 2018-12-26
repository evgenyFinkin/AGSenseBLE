package com.example.jonfi.ag_sense_ble.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.jonfi.ag_sense_ble.R
import com.example.jonfi.ag_sense_ble.utility.DeviceListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView_DeviceList.layoutManager = LinearLayoutManager(this)
        recyclerView_DeviceList.adapter = DeviceListAdapter()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    fun turnOnOff(turnOnOff: MenuItem)   {

    }
    fun scan(scan: MenuItem)   {

    }
}

