package com.ripanjatt.wallpaperLib

fun main() {
    val api = WallpaperLib()
    api.start("hinata")
    api.setListener(object: Listener {
        override fun onStartListener() {
            println("Started!")
        }

        override fun onCompleteListener(urlList: ArrayList<String>) {
            println("Complete: ${urlList.size}")
            println(urlList[0])
        }

        override fun onErrorListener(error: String) {
            println(error)
        }

    })
}