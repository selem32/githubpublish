package com.selem.system

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class MyBaseActivity : AppCompatActivity() {

    open fun testPrintLog() {
        Log.e("LOG", "print")
    }

    open fun testPrintLog2() {
        Log.e("LOG", "print")
    }

    open fun testPrintLog3() {
        Log.e("LOG", "print")
    }
}