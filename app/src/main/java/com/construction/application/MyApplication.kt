package com.construction.application

import android.app.Application
import com.rommansabbir.networkx.core.NetworkXCore
import com.rommansabbir.networkx.strategy.NetworkXObservingStrategy
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        NetworkXCore.init(this, NetworkXObservingStrategy.CUSTOM(12 * 1000))
    }
}