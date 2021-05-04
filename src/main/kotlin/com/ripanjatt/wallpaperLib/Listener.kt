package com.ripanjatt.wallpaperLib

interface Listener {
    fun onStartListener()
    fun onCompleteListener(urlList: ArrayList<String>)
    fun onErrorListener(error: String)
}