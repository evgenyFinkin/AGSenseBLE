package com.example.jonfi.ag_sense_ble.utility

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jonfi.ag_sense_ble.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.device_list.view.*

class DeviceListAdapter: RecyclerView.Adapter<ViewHolderDevieFromListItem> (){

    //TODO(add a list of bluetooth devices, size and relevant device info)
    //val deviceList = listOf<bluetooth devices>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDevieFromListItem {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val device_list = layoutInflater.inflate(R.layout.device_list, parent, false)
        return ViewHolderDevieFromListItem(device_list)
    }

    override fun getItemCount(): Int {
        return 4//deviceList.size
    }

    override fun onBindViewHolder(holder: ViewHolderDevieFromListItem, position: Int) {
        //val string from deviceList to Set text = id.get(position)
        holder.view.device_name?.text = "My device name"
        holder.view.status?.text = "My device status"
        //TODO(need to check if device is enabled)
        /*
        holder.view.device_enabled.setImageResource(R
            IsEnabled(deviceList.get(position))? R.drawable.ic_check: R.drawable.ic_close
        )
        */
    }

}

class ViewHolderDevieFromListItem(val view: View): RecyclerView.ViewHolder(view)  {

}