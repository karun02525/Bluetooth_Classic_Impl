package com.bluetooth_demo.utils

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.toast(mess:String){
    Toast.makeText(this, mess, Toast.LENGTH_SHORT).show()
}

fun log(mess:String){
    Log.d("TAGS", "log:-> $mess ")
}