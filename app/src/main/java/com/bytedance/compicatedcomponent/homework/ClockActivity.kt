package com.bytedance.compicatedcomponent.homework

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.bytedance.compicatedcomponent.R
class ClockActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val Hand = Handler(Looper.getMainLooper())
        Hand.post(object : Runnable {
            override fun run() {
                setContentView(R.layout.activity_clock)
                Hand.postDelayed(this, 1000)
            }
        })
    }
}
