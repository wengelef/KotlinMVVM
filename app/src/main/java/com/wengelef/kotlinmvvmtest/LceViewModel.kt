package com.wengelef.kotlinmvvmtest

import android.databinding.BaseObservable

abstract class LceViewModel<in Content> : BaseObservable() {

    abstract fun onLoading()
    abstract fun onContent(content: Content)
    abstract fun onError(message: String = "")
    abstract fun onConnectivity(connected: Boolean)
}