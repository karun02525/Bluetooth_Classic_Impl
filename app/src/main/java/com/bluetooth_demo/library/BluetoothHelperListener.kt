package com.bluetooth_demo.library

import android.bluetooth.BluetoothDevice


interface BluetoothHelperListener {

    fun onStartDiscovery()

    fun onFinishDiscovery()

    fun onEnabledBluetooth()

    fun onDisabledBluetooh()

    fun getBluetoothDeviceList(device: BluetoothDevice?)
}