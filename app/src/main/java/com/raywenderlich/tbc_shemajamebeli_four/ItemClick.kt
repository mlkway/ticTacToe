package com.raywenderlich.tbc_shemajamebeli_four

import android.widget.Button

interface ItemClick {

    fun clickListener(btn: Button, position: Int)
}